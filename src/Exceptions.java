import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		System.out.println("Bye!");
		
		/*
		 * Checked Exception - explicitly check for in our code.
		 * try catch block - handles checked exceptions
		 * 
		 * Unchecked Exception - something we have control over and only occurs if we make mistakes in coding
		 */
		
		try {
			FileReader fileReader = new FileReader("Something.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			
		}finally {
			System.out.println("Finally!");
		}
	
		
		System.out.println("After the try catch");
		
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}

}
