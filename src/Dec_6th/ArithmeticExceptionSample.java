package Dec_6th;

public class ArithmeticExceptionSample {
	public void divideValue(int x, int y) {
		System.out.println("We are about to divide");
		int result = x / y;
		System.out.println("The result is "+result);
		System.out.println("We are leaving divide method....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticExceptionSample aes = new ArithmeticExceptionSample();
		aes.divideValue(100, 25);
		System.out.println("--------------------");
		aes.divideValue(100, 50);
		System.out.println("--------------------");
		aes.divideValue(100, 2);
		System.out.println("--------------------");
		aes.divideValue(100, 0);
		System.out.println("--------------------");

	}

}
