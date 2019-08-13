import java.lang.Math;

public class html{
	public static void main(String[] args){
		long i;		
		long ii;
		long iii;
	
		iii=Integer.parseInt(args[0].toString());
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>");
		System.out.println("\n <table border='1'>");
		
		for(i=0;i<64;i++){
			ii=Math.round(Math.pow(iii,i));
			System.out.println("<tr><td> " + args[0] + "</td><td> ^ </td><td>" + Long.toString(i) + "</td><td> = </td><td>" + Long.toString(ii) + "</td></tr>\n");
		}
		
		
		System.out.println("</table></body></html>");
	}
}
