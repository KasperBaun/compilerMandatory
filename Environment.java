import java.util.HashMap;
import java.util.Map.Entry;

enum Type{
    DOUBLETYPE, BOOLTYPE  
}
// Added Value for implementing type-check of variables.
class Value {
    public Type valuetype;
    public double i;     // only valid if valuetype==DOUBLETYPE
    public boolean b; // only valid if valuetype==BOOLTYPE
    Value(double i){valuetype=Type.DOUBLETYPE; this.i=i;}
    Value(boolean b){valuetype=Type.BOOLTYPE; this.b=b;}
    public String toString(){
	if (valuetype==Type.BOOLTYPE){
	    return ""+b;
	}
	return ""+i;
    }
}

class Environment {
    private HashMap<String,Value> variableValues = new HashMap<String,Value>();
    public Environment() { }	
    public void setVariable(String name, Value value) {
	variableValues.put(name, value);
    }
    
    public Value getVariable(String name){
	Value value = variableValues.get(name); 
	if (value == null) { System.err.println("Variable not defined: "+name); System.exit(-1); }
	return value;
    }
    
    public String toString() {
	String table = "";
	for (Entry<String,Value> entry : variableValues.entrySet()) {
	    table += entry.getKey() + "\t-> " + entry.getValue() + "\n";
	}
	return table;
    }   
}

class CommandEnvironment{
    private HashMap<String,Command> funDefs = new HashMap<String,Command>();
    public CommandEnvironment() { }	
    public void setCommand(String name, Command f) {
	funDefs.put(name, f);
    }    
    public Command getFunction(String name){
	Command f = funDefs.get(name); 
	if (f == null) faux.error("Function not defined: "+name); 
	return f;
    }
}

class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
	System.err.println("Interpreter error: "+msg);
	System.exit(-1);
    }
}
