package FileIO;

import java.io.*;


public class CopyingTwoFileContentIntoOneFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fis1 = new FileInputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/source1.txt");
		FileInputStream fis2 = new FileInputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/source2.txt");
		
		try (FileOutputStream fos = new FileOutputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/destination.txt"))
		{
			SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
			
			int b;
			while((b=sis.read())!=-1)
			{
				fos.write(b);
			}
			
			System.out.println("File successfully copies to destination file");
			
			sis.close();
			fis1.close();
			fis2.close();
				
		}
		
		
			
			
	}

}
