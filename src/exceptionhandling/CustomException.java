package exceptionhandling;

public class CustomException {

	public static void main(String[] args) {
		try {
			validateAge(14);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	static String validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Not Eligible For Voting");
		}
		else {
			return "Eligible for voting";
		}
	}

}

