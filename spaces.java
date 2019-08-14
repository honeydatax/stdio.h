import java.lang.Math;

public class spaces{
	public static void main(String[] args){
		long i;		
		long ii;
		long iii;
		String s[];
		String sss;
		
		sss=(args[0].toString()).replaceAll("%20"," ");
		s=sss.split("!");
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>");
		System.out.println(sss.toString()+" <br>\n");
		
		for(String ss : s){
			System.out.println(ss+" <br>\n");
		}
		
		
		System.out.println("</table></body></html>");
	}
}
