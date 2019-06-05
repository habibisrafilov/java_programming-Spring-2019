package day_08_casting_conditionals;
import java.util.*;
public class CastingPrimitives {
	
	public static void main(String[] args){
	
		
		  // casting : canvorting one type to another 
		// cast double value to int 
		
		int i = (int)3.4;  // will remove .4
		
		System.out.println(i);
		
		
		double price = 230.50;
		int dollars = (int)price; // we cast double into int 
		
		System.out.println(dollars);
		System.out.println(price);
		
		
		// whole numbers: byte short int 
		
		
		int count =44;
		byte byteCount = (byte)count;
		
		System.out.println(byteCount);
		
		int num1 = 550;
		short num2 =(short) num1;
		
		
		System.out.println(num2);
		
		int num3 = 23;
		double num5 = num3;
		
		System.out.println(num5);
		
		
		long longValue = 4645454;
		int shortValue = (int)longValue;
		
		
		System.out.println(shortValue);
		
		int large = 5678;
		
		short small = (short)large;
		System.out.println(small);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
