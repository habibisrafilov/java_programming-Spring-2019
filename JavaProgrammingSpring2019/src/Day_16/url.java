package Day_16;
import java.util.*;
public class url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		System.out.println(url.startsWith("www.")); //check www.
		
		System.out.println(url.contains(".")); // 1) check . is there right before extension
		
		//  2) find out the length of the url. do -4 and using charAt get the caracter
		// compare if it is '.'
		int nums = url.length()-4;
		//url.lastIndexOf(".");
		System.out.println(url.charAt(nums));
		
		System.out.println("Domain: "+url.substring(4,10));
		System.out.println("Extension: "+url.substring(11));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
