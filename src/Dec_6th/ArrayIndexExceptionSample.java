package Dec_6th;

public class ArrayIndexExceptionSample {
	public void CheckArrayException() {
		int arr[] = new int[5];
		try {
			for(int i = 0; i<=5; i++) { //java.lang.ArrayIndexOutOfBoundsException caused by putting = .
				arr[i] = (i+1)*10;
				System.out.println(arr[i]);
			}
	      }
		catch(ArrayIndexOutOfBoundsException aie) {
//			System.out.println(aie.getMessage());
			aie.printStackTrace();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			System.out.println("We are in Finally block...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are about to invoke Array Intialization method");
		ArrayIndexExceptionSample aies = new ArrayIndexExceptionSample();
		aies.CheckArrayException();
		System.out.println("we completed call to array initializaton");

	}

}
