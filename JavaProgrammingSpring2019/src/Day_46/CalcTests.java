package Day_46;

public class CalcTests {
	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7);
		System.out.println("result: "+result);
		
		result=Calculator.minus(44, 33);
		System.out.println(result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(4, 2));
		
		
		
		
	}

}
