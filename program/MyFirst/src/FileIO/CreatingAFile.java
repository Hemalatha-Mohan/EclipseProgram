package FileIO;

import java.io.*;

public class CreatingAFile {

	public static void main(String[] args)throws Exception {
		
		try (FileOutputStream fos = new FileOutputStream("c:/Users/sandhata.LAPTOP-5IG14TJ9/MyJava/Test.txt")) {
			String str = "Learn Java Programming";
					
					byte b[] = str.getBytes();
					fos.write(b);
		}
	}

}
