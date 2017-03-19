import org.python.util.PythonInterpreter;

public abstract class PythonCall implements BaseInterface{
	PythonInterpreter interpreter;
	
public PythonInterpreter init(String filePath,String scriptName) {
	String FILE_PATH=filePath;
	 interpreter= new PythonInterpreter();
	 interpreter.exec("import sys\n" + "import os\n" + "sys.path.append('" + FILE_PATH + "')\n"+ "from "+scriptName+" import * \n");
	 return interpreter;
}
public void callFunction(String funcName){
	String function=funcName;
}
}
