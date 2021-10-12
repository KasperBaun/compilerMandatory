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
	if(valuetype==Type.DOUBLETYPE) return ""+i;
    return null;}
}

class Environment {
    private HashMap<String,Value> variableValues = new HashMap<String,Value>();
    public Environment() { }	
    public void setVariable(String name, Value value) {
	variableValues.put(name, value);
    }
    
    public Value getVariable(String name){
	Value value = variableValues.get(name); 
	if (value == null) { 
        System.err.println("Variable not defined: "+name); 
        System.exit(-1); }
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

