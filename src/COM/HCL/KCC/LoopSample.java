package COM.HCL.KCC;

import java.util.Scanner;

public class LoopSample {
	Scanner scan = new Scanner(System.in);
	int num;
	int square;
	String reply = "yes";
	public void dowhilesampler() {
		do {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if(num>=100) {
				System.out.println("Num entered is to be in range 1-100");
//				break;
				continue;
			}
			
			square = num * num;
			System.out.println("The square of the number is "+square);
			System.out.println("Do you wish to continue Yes/No:");
			reply = scan.next();
		}while(reply.equals("YES")|| reply.equals("Yes") || reply.equals("yes"));
	}
	public void forex() {
		int num = 0;
		for(int i=0; i<10; i++) {
			num+=10;
			System.out.println("The number is: "+num);
		} 
	}
	
	public void ternarycheck() {
		String result;
		int score = 49;
		result = (score >= 50)?"PASSED":"SORRY TRY AGAIN";
		System.out.println("The score is "+score+" Result is "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopSample wsamp = new LoopSample();
//		wsamp.dowhilesampler();
//		wsamp.forex();
		wsamp.ternarycheck();

	}

}
