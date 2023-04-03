import java.io.IOException;

public class Test {
	
	class X{
		public void printFileContent() {
			throw new IOException();
		}
	}

	public class Questions {
	public static void main(String[] args) {
		X xobj = new X();
		xobj.printFileContent();
		

	}

}
}