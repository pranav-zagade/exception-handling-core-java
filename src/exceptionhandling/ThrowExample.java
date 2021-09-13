package exceptionhandling;

public class ThrowExample {
	public static void main(String[] args) {
		System.out.println("in main method");
		try
		{
			System.out.println("in try block...");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("in catch block...");
		}
	}
}
