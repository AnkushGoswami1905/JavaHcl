package COM.HCL.KCC;

public class SampleConstruct {
    //If Else Construct Sample
	public void CheckIfElse(int score){
		if (score >= 50 && score < 60) {
			System.out.println("Good Passed...");
		}
		else {
			System.out.println("Sorry try again...");
		}
		
	}
	//Nested if else
	public void CheckIfElseIf(int score) {
		if ((score >= 0) && (score <= 100)) {
			if ((score >= 50) && (score < 60)){
				System.out.println("Good passed...");
			}
			else if ((score >= 60) && (score < 70)){
				System.out.println("Very good secured first class...");
			}
			else if ((score >= 70) && (score < 100)){
				System.out.println("Excellent, Secured Distinction...");
			}
			else {
				System.out.println("Sorry try again...");
			}
		}
		else {
			System.out.println("Sorry valid range is 0-100");
		}
	}
	
	//Switch Case Statements
	public void CheckSwitch(int day) {
		switch(day) {
		
		   case 1:
		   {
			System.out.println("The day is Monday");
			break;
		   }
		   case 2:
		   {
			System.out.println("The day is Tuesday");
			break;
		   }
		   case 3:
		   {
			System.out.println("The day is Wednesday");
			break;
		   }
		   case 4:
		   {
			System.out.println("The day is Thursday");
			break;
		   }
		   case 5:
		   {
			System.out.println("The day is Friday");
			break;
		   }
		   case 6:
		   {
			System.out.println("The day is Saturday");
			break;
		   }
		   case 7:
		   {
			System.out.println("The day is Sunday");
			break;
		   }
		   case 8:
		   {
			System.out.println("The day is invalid...");
		   }
		}
	}
	
	
	public static void main(String[] args) {
		SampleConstruct samp = new SampleConstruct();//object creation
		samp.CheckIfElseIf(43);
		samp.CheckIfElseIf(56);
		samp.CheckIfElseIf(67);
		samp.CheckIfElseIf(76);
		samp.CheckIfElseIf(176);
		samp.CheckSwitch(2);




	}

}
