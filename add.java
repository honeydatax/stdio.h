import java.lang.Math;
import java.io.*;

public class add{
	public static void main(String[] args){
		long i;		
		long ii;
		long iii;
		long iiii;
		String s;
		String sss;
		FileWriter f3 =null;
	
		iii=0;
		ii=0;
		
		
		sss=(args[0].toString()).replaceAll("%20"," ");
		s=sss;

		System.out.println("Content-type:text/txt\r\n\r");

		try{
			FileReader f1 =new FileReader("clients.dat");
			StringBuilder s1 = new StringBuilder();
			char [] cs = new char [4096];
			int i1=0;
			do{
				s1.append(cs,0,i1);
				i1=f1.read(cs);
			}while(i1>=0);
			f1.close();
			sss=s1.toString()+s;
			ii=1;
		}catch(IOException e){
			ii=0;
		}

		/*try{

			if (ii==0){
				System.out.println("creating file");
				f3 = new FileWriter("clients.dat");
				f3.close();
				
			}
		}catch(IOException e){
			ii=0;
			System.out.println("error creat");
		}
		*/ 


		try{
			System.out.println(sss);
			PrintWriter pf1 = new PrintWriter(new BufferedWriter(new FileWriter("clients.dat",true)));
			pf1.println(s);
			pf1.close();
		}catch(IOException e){
			ii=0;
			System.out.println("error write");
		}

	}
}
