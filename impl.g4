grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      	    # SingleCommand
	| '{' cs+=command* '}'           	        # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         	    # Assignment
	| 'output' e=expr ';'            	        # Output
        | 'while' '('c=condition')' p=program 	# WhileLoop
	;
	
expr	: '(' e=expr ')'      			        # Parenthesis
    | e1=expr '/' e2=expr			            # Division
	| e1=expr '*' e2=expr 			            # Multiplication
	| c=FLOAT     	      			            # Constant
	| x=ID		      			                # Variable
    | e1=expr '+' e2=expr 		                # Addition
	| e1=expr '-' e2=expr			            # Subtraction
	;

condition : e1=expr '!=' e2=expr 		        # Unequal
	  // ... extend me 
	  ;  

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : '-'? NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
