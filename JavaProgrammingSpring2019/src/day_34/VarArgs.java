package day_34;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		
		printWords("red","blue","black");
		printWords("grey");
		printWords();
		
		System.out.println(sum(3,5,6,2));
		System.out.println(sum(37644,4342443,423432423,3344,32321312,31413413,413413,41343141));
		int budget = 200;
		System.out.println(sum(40,55,70,25));
		if(sum(40,55,70,25)<=budget) {
			System.out.println("that is write");
			
			cook("burrito bowl", "rice","meat","beans","salsa","cream");
			cook("avacodo toast","avacado","sunny eggs", "cheese");
			
			
			shopping(1000," t-shirt","watch","shoes");
			
		}
	}
	
	public static void printWords(String... words) {
		// handle it like array
		for(String word : words) {
			System.out.println(word);
			
			
		}
	}
	
	public static int sum(int...nums) {
		int sum = 0;
		for(int n:nums) {
			sum+=n;
		}
		return sum;
	}
	
	
	public static void cook(String name,String...ings) {
		System.out.println(name);
		System.out.println(Arrays.toString(ings));
	}
	
	public static void shopping(int price , String...list) {
		System.out.print("Shoping price: "+price);
		System.out.println(" Shoping list: "+Arrays.toString(list));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
