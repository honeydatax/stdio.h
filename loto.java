import java.lang.Math;
import java.util.Arrays;

public class loto{
	public static void main(String[] args){
		int i;		
		long ii[];
		long iii[]=new long[10];
		
	
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>\n <br>");
		System.out.println("<bt>\n <table border='1'>");
		System.out.println("<tr><td> number </td></tr>\n");
		for(i = 0;i < 10 ; i++ ) {
			iii[i]=Math.round(Math.random()*49.00+1.00);
		}
		Arrays.sort(iii);
		for(i = 0;i < 10 ; i++ ) {
			System.out.println("<tr><td>" + Long.toString(iii[i]) +  "</td></tr>\n");
		}
		
		
		System.out.println("</table></body></html>");
	}
}
