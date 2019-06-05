package day_15;
import java.util.Scanner;
public class StartsEndWith {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word1 = "eclipse";
		// startsWith ==> tests if string start with another string 
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecli"));
		System.out.println(word1.startsWith("Ec"));
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("java"));
		System.out.println(word1.toUpperCase().endsWith("SE"));
		System.out.println(word1.endsWith("eclipse"));
		
		String name = "Mr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("unknown status");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
