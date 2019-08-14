import java.io.*;


public class counter{
	public static void main(String[] args){
		int i;		
		int ii;
		int iii;
		FileInputStream f1 =null;
		FileOutputStream f2 =null;
		FileWriter f3 =null;
	
		iii=0;
		System.out.println("Content-type:text/html\r\n\r\n");
		System.out.println("<html><head><title>java server</title></head><body>");
		try{
			f1 = new FileInputStream("counter.dat");
			iii=f1.read();
			f1.close();
		}catch(IOException e){
			iii=0;
		}

		try{
			if (iii==0){
				f3 = new FileWriter("counter.dat");
				f3.write(iii);
				f3.close();
			}
		}catch(IOException e){
			iii=0;
		}



		iii=iii+1;

		



		try{
			f2 =new FileOutputStream("counter.dat");
			f2.write(iii);
			f2.close();
		}catch(IOException e){
			iii=0;
		}
		
			System.out.println("<p> " +  Integer.toString(iii) + " visit the site.</p>\n");
		
		
		
		System.out.println("</body></html>");
	}
}
