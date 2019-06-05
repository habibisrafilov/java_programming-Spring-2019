package day_27_arrays;

import java.util.Arrays;

public class Times {
	public static void main(String[] args) {
		
	String url = "https://learn.scybertekschool.com/courses/149";
	
	String[] lastValue = url.split("/");
	
	System.out.println("Elements "+lastValue.length);
	System.out.println("last value: "+lastValue[4]);
	
	int coursID=Integer.parseInt(lastValue[4]);
	
	 System.out.println(Arrays.toString(lastValue));
	   
	
	
	
	}

}
