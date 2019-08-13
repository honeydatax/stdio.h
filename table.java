public class table{
	public static void main(String[] args){
		int i;		
		int ii;
		int iii;
	
		iii=Integer.parseInt(args[0].toString());
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>");
		for(i=0;i<13;i++){
			ii=i*iii;
			System.out.println("<p> " + args[0] + " X " + Integer.toString(i) + " = " + Integer.toString(ii) + "</p>\n");
		}
		
		
		System.out.println("</body></html>");
	}
}
