package DEc_5th;

public class ExceptionSamples {
	public void checkarrayexception(){
		int arr[] = new int[5];
		for(int i=0; i<=5; i++) {
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSamples exp = new ExceptionSamples();
		System.out.println("About to call array method");
		exp.checkarrayexception();

	}

}
