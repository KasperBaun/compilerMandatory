public abstract class AST{
};

abstract class Expr extends AST{
    abstract public Value eval(Environment env);
}

class Division extends Expr{
    Expr e1,e2;
    Division(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if(v1.valuetype==Type.DOUBLETYPE &&
           v2.valuetype==Type.DOUBLETYPE){
               return new Value(v1.i/v2.i);
           }
	return null;
    }
}

class Multiplication extends Expr{
    Expr e1,e2;
    Multiplication(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if(v1.valuetype==Type.DOUBLETYPE &&
           v2.valuetype==Type.DOUBLETYPE){
               return new Value(v1.i*v2.i);
           }
	return null;
    }
}

class Addition extends Expr{
    Expr e1,e2;
    Addition(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if(v1.valuetype==Type.DOUBLETYPE &&
           v2.valuetype==Type.DOUBLETYPE){
               return new Value(v1.i+v2.i);
           }
	return null;
    }
}

class Subtraction extends Expr{
    Expr e1,e2;
    Subtraction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if(v1.valuetype==Type.DOUBLETYPE &&
           v2.valuetype==Type.DOUBLETYPE){
               return new Value(v1.i-v2.i);
           }
	return null;
    }
}

class Constant extends Expr{
    public Value v;
    Constant(Value v){this.v=v;}
    public Value eval(Environment env){
	return v;
    }
}

class Variable extends Expr{
    String varname;
    Variable(String varname){this.varname=varname;}
    public Value eval(Environment env){
	return env.getVariable(varname);
    }
}

class Array extends Expr{
    String id;
    Expr i,e;
    Array(String id, Expr i){this.id=id; this.i=i;}
    public Value eval(Environment env){
        Value v1 = i.eval(env);
        int x = 0;
        if(v1.valuetype==Type.DOUBLETYPE){
            x = (int) Math.round(v1.i);
        }
        String name = id+"["+x+"]";
        //System.out.println("Name: "+name+" = "+env.getVariable(name));
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
	Value value=e.eval(env);
        if(value.valuetype==Type.DOUBLETYPE){
            env.setVariable(v,value);
        }
    }
}

class ArrayAssignment extends Command{
    String id;
    Expr i,e;
    ArrayAssignment(String id,Expr i, Expr e){
	this.id=id; this.i=i; this.e=e;
    }
    public void eval(Environment env){
        Value v1 = i.eval(env);
        Value v2 = e.eval(env);
        int x = 0;
        if(v1.valuetype==Type.DOUBLETYPE){
            x = (int) Math.round(v1.i);
            //System.out.println("x er : "+x);
        }
    String array=(id+"["+x+"]");
    if(v2.valuetype==Type.DOUBLETYPE){
        //System.out.println(array+ " = "+ v2.i);
	env.setVariable(array,v2);}
    }
}

class Output extends Command{
    Expr e;
    Output(Expr e){
	this.e=e;
    }
    public void eval(Environment env){
	Value d=e.eval(env);
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
        Value con = c.eval(env);
        if(con.valuetype==Type.BOOLTYPE){
	    while (c.eval(env).b){
            //System.out.println("Vi er i while-loop");
	        body.eval(env);
        }
    }
}
}

class If extends Command{
    Condition c;
    Command body;
    If(Condition c, Command body){
	this.c=c; this.body=body;
    }
    public void eval(Environment env)
    {
        Value con = c.eval(env);
        if(con.valuetype==Type.BOOLTYPE&&con.b==true){
	    body.eval(env);
    }
    }
}

class For extends Command{
    String i;
    Expr index,n;
    Command body;
    For(String i, Expr index,Expr n, Command body){
        this.i=i; this.index=index; this.n=n; this.body=body;
    }

    public void eval(Environment env){
        env.setVariable(i, index.eval(env));
        //System.out.println(i+index.eval(env, cmdEnv).i);
        //System.out.println("i out of loop : "+i.eval(env));
        Value v1 = index.eval(env);
        //System.out.println(v1.i);
        Value v2 = n.eval(env);
        //System.out.println(v2.i);
        if(v1.valuetype==Type.DOUBLETYPE &&
           v2.valuetype==Type.DOUBLETYPE){
            for(env.getVariable(i); env.getVariable(i).i<n.eval(env).i; env.setVariable(i, new Value(env.getVariable(i).i+1))){
                //System.out.println("i in loop : "+env.getVariable(id));
                //System.out.println("index in loop : "+env.getVariable(i).i);
                //System.out.println("n in loop : "+n.eval(env));
                body.eval(env); 
           }
                   
        }
    }
}



abstract class Condition extends AST{
    abstract public Value eval(Environment env);
}

class Not extends Condition{
    Expr e1,e2;
    String op;
    Not(Expr e1,Expr e2, String op){this.e1=e1; this.e2=e2; this.op=op;}
    public Value eval(Environment env){
        Value v1 = e1.eval(env);
        Value v2 = e2.eval(env);
        if(op.equals("!=")){
        if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
        return new Value(v1.i!=v2.i);
        } 
        return null;
    }
}

class Equality extends Condition{
    Expr e1,e2;
    String op;
    Equality(Expr e1,Expr e2, String op){this.e1=e1; this.e2=e2; this.op=op;}
    public Value eval(Environment env){
        Value v1 = e1.eval(env);
        Value v2 = e2.eval(env);
        if(op.equals("==")){
           if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
           //System.out.println("Det virker"+"V1: "+v1.valuetype+" V2: "+v2.valuetype);
           //System.out.println("Value : "+(v1.i==v2.i));
           return new Value(v1.i==v2.i);
        }
        if(op.equals("!=")){
        if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
        return new Value(v1.i!=v2.i);
        }
        if(op.equals(">")){
            if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
            return new Value(v1.i>v2.i);
        }
        if(op.equals(">=")){
            if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
            return new Value(v1.i>=v2.i);
        }
        if(op.equals("<")){
            if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
            return new Value(v1.i<v2.i);
        }
        if(op.equals("<=")){
            if(v1.valuetype==Type.DOUBLETYPE && v2.valuetype==Type.DOUBLETYPE)
            return new Value(v1.i<=v2.i);
        }
        return null;
    }
 
}


class LogicalAnd extends Condition{
    Condition c1,c2;
    LogicalAnd(Condition c1,Condition c2){this.c1=c1; this.c2=c2;}
    public Value eval(Environment env){
        Value v1 = c1.eval(env);
        Value v2 = c2.eval(env);
        if(v1.valuetype==Type.BOOLTYPE && v2.valuetype==Type.BOOLTYPE){
            return new Value(v1.b&&v2.b);
        }
        return null;
    }
 
}

class LogicalOr extends Condition{
    Condition c1,c2;
    LogicalOr(Condition c1,Condition c2){this.c1=c1; this.c2=c2;}
    public Value eval(Environment env){
        Value v1 = c1.eval(env);
        Value v2 = c2.eval(env);
        if(v1.valuetype==Type.BOOLTYPE && v2.valuetype==Type.BOOLTYPE){
            return new Value(v1.b||v2.b);
        }
        return null;
    }
 
}
