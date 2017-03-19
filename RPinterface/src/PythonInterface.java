import org.python.core.PyException;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;

public class PythonInterface {
public static void main(String[] args) {
	PythonInterpreter interpreter = new PythonInterpreter();
    String fileUrlPath = "C:/Python27";
    String arg1="Hi";
    String arg2="Hello";
    String arg3="K";
    String scriptName = "trial2";
    interpreter.exec("import sys\n" + "import os\n" + "sys.path.append('" + fileUrlPath + "')\n"+ "from "+scriptName+" import * \n");
    String funcName = "myscript";
    PyObject someFunc = interpreter.get(funcName);
    if (someFunc == null) {
        System.out.println("No function");
    }
    try {
    	PyObject result =someFunc.__call__(new PyString(arg1), new PyString(arg2), new PyString(arg3));
    	
    	System.out.println(result.__tojava__(Integer.class));
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
