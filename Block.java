package blockage;
public class Block {

	static void validate(int age) {
		
		if(age < 18) 
			
			throw new ArithmeticException("not valid");
			
			else
				System.out.println("welcome to vote");
		}
	
	public static void main(String[] args) {
		
		try {
		validate(13);
	
	
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("end of program");
		}
	}
}
