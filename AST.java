public abstract class AST{
};

abstract class Expr extends AST{
    abstract public Double eval(Environment env);
}

class Division extends Expr{
    Expr e1,e2;
    Division(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env)/e2.eval(env);
    }
}

class Multiplication extends Expr{
    Expr e1,e2;
    Multiplication(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env)*e2.eval(env);
    }
}

class Addition extends Expr{
    Expr e1,e2;
    Addition(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env)+e2.eval(env);
    }
}

class Subtraction extends Expr{
    Expr e1,e2;
    Subtraction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env)-e2.eval(env);
    }
}

class Constant extends Expr{
    Double d;
    Constant(Double d){this.d=d;}
    public Double eval(Environment env){
	return d;
    }
}

class Variable extends Expr{
    String varname;
    Variable(String varname){this.varname=varname;}
    public Double eval(Environment env){
	return env.getVariable(varname);
    }
}

class Array extends Expr{
    String id;
    Expr i;
    Array(String id, Expr i){this.id=id; this.i=i;}
    public Double eval(Environment env){
        String name = id+"["+i.eval(env).intValue()+"]";
        //System.out.println("Name: "+name);
	return env.getVariable(name);
    }
}

abstract class Command extends AST{
    abstract public void eval(Environment env);
}

// Do nothing command 
class NOP extends Command{
    public void eval(Environment env){};
}

class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1, Command c2){this.c1=c1; this.c2=c2;}
    public void eval(Environment env){
	c1.eval(env);
	c2.eval(env);
    }
}


class Assignment extends Command{
    String v;
    Expr e;
    Assignment(String v, Expr e){
	this.v=v; this.e=e;
    }
    public void eval(Environment env){
	Double d=e.eval(env);
	env.setVariable(v,d);
    }
}

class ArrayAssignment extends Command{
    String id;
    Expr i,e;
    ArrayAssignment(String id,Expr i, Expr e){
	this.id=id; this.i=i; this.e=e;
    }
    public void eval(Environment env){
	Double d=e.eval(env);
    int index = i.eval(env).intValue();
    String array=(id+"["+index+"]");
	env.setVariable(array,d);
    }
}

class Output extends Command{
    Expr e;
    Output(Expr e){
	this.e=e;
    }
    public void eval(Environment env){
	Double d=e.eval(env);
	System.out.println(d);
    }
}

class While extends Command{
    Condition c;
    Command body;
    While(Condition c, Command body){
	this.c=c; this.body=body;
    }
    public void eval(Environment env){
	    while (c.eval(env)){
	        body.eval(env);
        }
    }
}

class If extends Command{
    Condition c;
    Command body;
    If(Condition c, Command body){
	this.c=c; this.body=body;
    }
    public void eval(Environment env){
	if (c.eval(env))
	    body.eval(env);
    }
}

class For extends Command{
    String id;
    Expr i,n;
    Command body;
    For(String id, Expr i,Expr n, Command body){
        this.id=id; this.i=i; this.n=n; this.body=body;
    }

    public void eval(Environment env){
        env.setVariable(id, i.eval(env));
        //System.out.println("i out of loop : "+i.eval(env));
        int index;
        int end = n.eval(env).intValue();
        for(index = i.eval(env).intValue(); index<end; index++){
            //System.out.println("i in loop : "+env.getVariable(id));
            //System.out.println("index in loop : "+index);
            //System.out.println("n in loop : "+n.eval(env));
            body.eval(env);
            env.setVariable(id, env.getVariable(id)+1);            
        }
    }
}



abstract class Condition extends AST{
    abstract public Boolean eval(Environment env);
}

class Equality extends Condition{
    Expr e1,e2;
    String op;
    Equality(Expr e1,Expr e2, String op){this.e1=e1; this.e2=e2; this.op=op;}
    public Boolean eval(Environment env){
        double x1 = e1.eval(env);
        double x2 = e2.eval(env);
       if(op.equals("==")){
           return x1==x2;
       }
       if(op.equals("!=")){
        return x1!=x2;
        }
        if(op.equals(">")){
            return x1>x2;
        }
        if(op.equals(">=")){
            return x1>=x2;
        }
        if(op.equals("<")){
            return x1<x2;
        }
        if(op.equals("<=")){
            return x1<=x2;
        }
        return null;
    }
 
}


class LogicalAnd extends Condition{
    Condition c1,c2;
    LogicalAnd(Condition c1,Condition c2){this.c1=c1; this.c2=c2;}
    public Boolean eval(Environment env){
	return c1.eval(env)&&(c2.eval(env));
    }
 
}

class LogicalOr extends Condition{
    Condition c1,c2;
    LogicalOr(Condition c1,Condition c2){this.c1=c1; this.c2=c2;}
    public Boolean eval(Environment env){
	return c1.eval(env)||(c2.eval(env));
    }
 
}
