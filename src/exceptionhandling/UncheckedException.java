package exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		//expecting divide by zero exception which will be identified at runtime
		int result=10/0;
		System.out.println(result);
	}

}
