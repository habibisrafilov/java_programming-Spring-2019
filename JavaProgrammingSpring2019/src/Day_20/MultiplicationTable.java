package Day_20;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		
		if(num<1 || num>10) {
			System.out.println("Invalid number");
			return;
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		  
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
       