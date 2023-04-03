package FileIO;

import java.io.*;

public class ReadingFile {

	public static void main(String[] args)throws Exception
	{
		try (FileInputStream fis = new FileInputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/Test.txt")) {
			{
				
				int x;
				
				do
				{
					x=fis.read();
					if(x!=-1)
						System.out.print((char)x);
				}
						while(x!=-1);
				
				
						/*byte b[] = new byte [fis.available()];
						
						fis.read(b);
						
						String str = new String(b);
						
						System.out.println(str);*/

}
		}

}
	
}
