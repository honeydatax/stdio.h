import java.lang.Math;

public class client{
	public static void main(String[] args){
		long i;		
		long ii;
		long iii;
	
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>\n <br>");
		System.out.println("<bt>\n <table border='1'>");
		System.out.println("<tr><td> check </td><td>ID </td><td> NAME </td><td> VALUE </td></tr>\n");
		for(i = 0;i < 64 ; i++ ) {
			System.out.println("<tr><td>*</td><td>" + Long.toString(i) + "</td><td> client " + Long.toString(i) + "</td><td>" + Long.toString(i) + "</td></tr>\n");
		}
		
		
		System.out.println("</table></body></html>");
	}
}
