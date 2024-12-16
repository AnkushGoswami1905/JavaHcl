package Dec_6th;
//Functional Interface
interface FunctionalInterface1{
	public void SayHello();
}
interface Adder{
	public void add(int x, int y);
}
interface Calculator{
	public void calculatepurchvalue(int price, int qty);
}
interface Banking{
	public void provideDiscount(int price, int qty, Calculator cal);
}
public class LambdaExpressionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface1 fint1 = () -> {
			System.out.println("Welcome to Functional Interfaces");
			System.out.println("Functional Interface are SAM based");
			System.out.println("SAMs are implemented using LambdaExpression");
			System.out.println("Lambda Expression enable us to implement functinal interfaces");
			System.out.println("Through arrow function");
		};
		fint1.SayHello();
		
		Adder sum = (int x, int y) -> {
			int result =x + y;
			System.out.println("Result "+result);	
		};
		sum.add(100,200);
		
		Calculator calci1 = (int price1, int qty1)->{
			int purchvalue = price1 * qty1;
			double discount = 0.1* purchvalue;
			double actualpurchvalue = purchvalue - discount;
			System.out.println("Original purchase value "+purchvalue);
			System.out.println("Disscount Amount "+discount);
			System.out.println("Actual purchase Value "+actualpurchvalue);
		};
		Calculator calci2 = (int price2, int qty2)->{
			int purchvalue = price2 * qty2;
			double discount = 0.2* purchvalue;
			double actualpurchvalue = purchvalue - discount;
			System.out.println("Original purchase value "+purchvalue);
			System.out.println("Disscount Amount "+discount);
			System.out.println("Actual purchase Value "+actualpurchvalue);
		};
		
		Banking sbi = (int prodPrice, int qtypurch, Calculator calc)->{
			calc.calculatepurchvalue(prodPrice, qtypurch);
		};
		sbi.provideDiscount(10000, 10, calci1);// for 10% discount
		
		sbi.provideDiscount(10000, 10, calci2);// for 20% discount

	}

}
