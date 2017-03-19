import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Rinterface {
public static void main(String[] args) {
	RConnection connection = null;

    try {
        connection = new RConnection();
        connection.eval("source('C:\\\\New folder\\\\MyFirst.r')");
        int num1=10;
        int num2=20;
        int sum=connection.eval("myAdd("+num1+","+num2+")").asInteger();
        System.out.println("The sum is=" + sum);
    } catch (RserveException e) {
        e.printStackTrace();
    } catch (REXPMismatchException e) {
        e.printStackTrace();
    }
}
}
