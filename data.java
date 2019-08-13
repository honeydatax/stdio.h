import java.util.Date;


public class data{
	public static void main(String[] args){
		Date d =new Date();
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body><h1>");
		System.out.println("\n"+d.toString()+"\n");
		System.out.println("</h1></body></html>");
	}
}
