package exceptionhandling;

public class ExceptionMechanism {

	public static void main(String[] args) {
		System.out.println("in main method");
		try
		{
			System.out.println("in try block...");
			int result=10/0;
			System.out.println("result "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("in catch block...");
		}
		finally {
			System.out.println("in finally block...");
		}
	}
	
	

}
