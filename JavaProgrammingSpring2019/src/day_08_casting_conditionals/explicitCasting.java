package day_08_casting_conditionals;

public class explicitCasting {
	public static void main(String[] args) {
		
		System.out.println(10/2.0);  // result is double 
		
		
		  // find a average price of rent 
		int rent1=978;
		int rent2=1100;
		int rent3=1234;
		int rent4=894;
		
		 double average = (rent1+rent2+rent3+rent4)/4;
		 System.out.println(average);
		 
		
		double d = 40.2;
		int i = (byte)d;
		System.out.println(i);
		
		// in above statement both explicit and implicit casting happening.
		
		// explicit:  double>byte
		// implicit: byte>int
		
		int a = 10;
		double b=a;
		a=20;
		
		System.out.println(a+" "+b);
		
		System.out.println('a'+1);
		
		char ch = 98;
		System.out.println(ch);
		
		char ch1=65;
		System.out.println(ch1);
		
		System.out.println('H'+2);
		
		System.out.println('T'+1);
		System.out.println('t'+1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
