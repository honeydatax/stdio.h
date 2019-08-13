import java.util.Date;
import java.lang.Object;
import javax.script.*;



public class calc{
	public static void main(String[] args){
		ScriptEngineManager m = new ScriptEngineManager();
		ScriptEngine e = m.getEngineByName("js");
		Date d =new Date();
		int i;		
		
		
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body><h1>");
		try{
			System.out.println("\n"+args[0]+" = " + e.eval(args[0]).toString() + "\n");
		}catch(Exception ee){
			System.out.println("\n"+args[0]+" = error ?"  + "\n");
		}
		System.out.println("</h1></body></html>");
	}
}
