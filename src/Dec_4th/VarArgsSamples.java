package Dec_4th;

public class VarArgsSamples {
	public void SampleMethod(String StudentName, int score) {
		System.out.println("The student " +StudentName+" has scored "+score);
	}
	public void CheckVarArgs(String studentName, int score, String...myArgs) {
		System.out.println("Student "+studentName+" Score "+score);
		System.out.println("Subject chosen by student are.........");
		for(String str:myArgs) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		VarArgsSamples vas = new VarArgsSamples();
//		vas.SampleMethod("Kiran", 87);
//		vas.SampleMethod("Ranjan", 77);
//		vas.SampleMethod("Madan", 67);
		
		vas.CheckVarArgs("Kiran", 87,"Python","C++");
		System.out.println();
		vas.CheckVarArgs("Ranjan", 77,"JAVA","C#","c");
		System.out.println();
		vas.CheckVarArgs("Madan", 67,"PHP");
     
	}

}
