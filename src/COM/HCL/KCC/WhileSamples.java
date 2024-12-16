package COM.HCL.KCC;
import java.util.Scanner;

public class WhileSamples {
	
	Scanner scan1 = new Scanner(System.in);
	
    public void WhileChecker() {
    	String reply = "yes";
    	            while(reply.equals("Yes") || reply.equals("Yes") || reply.equals("yes")) {
    	            	int num;
    	            	System.out.println("Enter Number:");
    	            	num = scan1.nextInt();
    	            	int Square = num * num;
    	            	System.out.println("The square of the number is:"+Square);
    	            	System.out.println("Do you wish to continue Yes/No");
    	            	reply = scan1.next();
    	            }
    	            System.out.println("Hey you are out of loop...");
    }
    public void DoWhileChecker() {
    	String reply;
    	            do
    	            {
    	            	int num;
    	            	System.out.println("Enter Number:");
    	            	num = scan1.nextInt();
    	            	int Square = num * num;
    	            	System.out.println("The square of the number is:"+Square);
    	            	System.out.println("Do you wish to continue Yes/No");
    	            	reply = scan1.next();
    	            }
    	            while(reply.equals("Yes") || reply.equals("Yes") || reply.equals("yes"));
    	            System.out.println("Hey you are out of loop...");
    }
	public static void main(String[] args) {
		WhileSamples wsamp = new WhileSamples();
		//wsamp.WhileChecker();
		wsamp.DoWhileChecker();

	}

}
