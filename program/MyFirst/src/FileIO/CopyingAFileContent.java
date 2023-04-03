package FileIO;

import java.io.*;

public class CopyingAFileContent {

	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fis = new FileInputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/source1.txt");
		FileOutputStream fos = new FileOutputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/source2.txt");
		
		int b;
		while((b=fis.read())!=-1)
		{
				if(b>=65 && b<=90)fos.write(b+32);
				else
					fos.write(b);
				
		}
		
		System.out.println("success");
		fis.close();
		fos.close();

	}

}
