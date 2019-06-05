package day_33;

public class CalcTests {
	public static void main(String[] args) {
		
		
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.minus(40, 10));{
			System.out.println(Calculator.devided(30, 3));
			
			int addResult = Calculator.add(21, 41);
			double mResult = Calculator.multiply(5.5, 2.8);
			double minusResult = Calculator.minus(45, 15);
			double devidedresult = Calculator.devided(45, 9);
			System.out.println(addResult);
			System.out.println(mResult);
			System.out.println(minusResult);
			System.out.println(devidedresult);
			
			
			double a=10.0,b=5.0;
			double myResult = Calculator.minus(a, b);
			System.out.println(myResult);
			double [] dNums = {2.0 ,4.0};
			double result2 = Calculator.multiply(dNums[0], dNums[1]);
			System.out.println(result2);
			
			if(Calculator.add(10, 16)==26) {
				System.out.println("test pass");
			}else {
				System.out.println("add test fail");
			}
			
			String str = "java";
			if(str.length()==4) {
				System.out.println("4 char");
			}else {
				System.out.println("not 4 char");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
