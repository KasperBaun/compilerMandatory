grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      	    		# SingleCommand
	| '{' cs+=command* '}'           	  		# MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         	    		# Assignment
	| x=ID '=' '"' s=STR '"' ';'				# StringAssign
	| x=ID '[' i=NUM+ ']' '=' n=expr ';'			# ArrayAssign
	| 'output' e=expr ';'            	    		# Output
        | 'while' '(' c=condi ')' p=program 			# WhileLoop
	| 'for' '(' x=ID '=' i=expr '..' n=expr ')' p=program 	# ForLoop
	| 'if' '(' c=condi ')' p=program			#IfStatement
	;
	
expr	: '(' e=expr ')'      			        	# Parenthesis
    	| e1=expr op=MULTIDIV e2=expr 				# MultiplicationAndDivision
	| e1=expr op=ADDSUB e2=expr 				# AdditionAndSubtraction
	| c=FLOAT     	    					# Constant
	| x=ID		      					# Variable
	;
	
condi 	:  con1=condition  '&&' con2=condition 			#LogicalAnd
	| con1=condition  '||' con2=condition			#LogicalOr
	| e1=expr lop=logop e2=expr 				#LogicalOperators
	;  

logop	: '!=' | '==' | '>' | '>=' | '<' | '<='			#LogicalOperators 
	;	
 

ID		: ALPHA (ALPHA|NUM)* ;
STR		: (ALPHA|NUM)* ;
FLOAT		: '-'? NUM+ ('.' NUM+)? ;
MULTIDIV	:( '*' | '/');
ADDSUB		: ('+' | '-');

ALPHA		: [a-zA-Z_ÆØÅæøå] ;
NUM		: [0-9] ;


WHITESPACE	: [ \n\t\r]+ -> skip;
COMMENT		: '//'~[\n]*  -> skip;
COMMENT2	: '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
