public class Encapsulation {

	public static void main(String[] args) {
		
		
		 Student student = new Student();
		 student.setFirstName("Sally");
		 student.setPhoneNumber("1234567890");
		 student.introduce();//logic can be added to the getters and setters
		 
		 Rectangle rec = new Rectangle(10.0, 15.0);
		 rec.setLength(10.0);
		 System.out.println(rec.getArea());
		 
		 
		 /*
		  * Access modifiers:
		  * public - accessible everywhere
		  * private - only accessible within the class itself
		  * protected - accessible within the class, other classes within the same package, and all sublcasses
		  * no modifier same as protected, except not accessible in a sublcass in different packages
		  */

	}

}
