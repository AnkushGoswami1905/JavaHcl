package Dec_9th;

public class Recruitment {
	public void CheckAge(int age) throws InvalidAgeException{
		System.out.println("Recruitment Process Started");
		System.out.println("Checking Age...."); 
		if(age >= 25) {
		    InvalidAgeException iae = new InvalidAgeException("Not valid Age");
		    throw new InvalidAgeException("Error in Age");
		}
		System.out.println("AGE:"+age);
		System.out.println("Age scrutnization completed");
		System.out.println("Recruitment process to continue further");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("");
		Recruitment rc = new  Recruitment();
		try{
			rc.CheckAge(23);
			rc.CheckAge(22);
			rc.CheckAge(21); 
			rc.CheckAge(25);
			rc.CheckAge(27);
		}
		catch(InvalidAgeException iae){
			System.out.println("Age exception:"+iae.message);
		}
		System.out.println("We completed age checking process");
		System.out.println("We completed Recruitment process");

	}

}
