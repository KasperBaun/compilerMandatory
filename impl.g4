grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      	    			# SingleCommand
	| '{' cs+=command* '}'           	  					# MultipleCommands
	;
	
command : 
      x=ID '=' e=expr';'	         	    				# Assignment
	| x=ID '=' '"' s=ID '"' ';'								# StringAssign
	| x=ID '[' i=expr ']' '=' e=expr ';'					# ArrayAssign
	| 'output' e=expr ';'            	    				# Output
    | 'while' '(' c=condi ')' p=program		 				# WhileLoop
	| 'for' '(' x=ID '=' i=expr '..' n=expr ')' p=program 	# ForLoop
	| 'if' '(' c=condi ')' p=program						# IfStatement
	;
	
expr: 
	  e1=expr op=('*'|'/')  e2=expr							# MultiplicationAndDivision
	| e1=expr op=('-'|'+')  e2=expr 						# AdditionAndSubtraction
	| x=ID						      						# Variable
	| c=FLOAT 	    										# Constant
	| x=ID '[' e=expr ']'									# Array
	| '(' e=expr ')'      			        				# Parenthesis 
	;
	
condi: 
	  con1=condi  '&&' con2=condi	 						# LogicalAnd
	| con1=condi  '||' con2=condi							# LogicalOr
	| e1=expr eq=('=='|'!='|'>'|'>='|'<'|'<=') e2=expr 		# Equality
	;  



ID			: ALPHA(ALPHA|NUM)* ;
FLOAT		: '-'?NUM+ ('.' NUM+)? ;

ALPHA		: [a-zA-Z_ÆØÅæøå] ;
NUM			: [0-9] ;

WHITESPACE	: [ \n\t\r]+ -> skip;
COMMENT		: '//'~[\n]*  -> skip;
COMMENT2	: '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
