package day_34;

public class MetodOverloading {
	public static void main(String[] args) {
		add(10,20);
		add(25.99,15.88);
		add("one","seven");
		add("23",10);
		
	}
	
	public static void add(int num1,int num2) {
		int result = num1+num2;
		System.out.println("result: "+ result);
		
	}
	public static void add(double d1, double d2) {
		double result = d1+d2;
		System.out.println("result "+result);
	}

	    public static void add(String str1 , String str2) {
	    	String  result = str1+str2;
	    	System.out.println("result "+result);
	    }
}
