package day07_Scanner_Operators;
import java.util.Scanner;
public class Shopping_List1 {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String item1,item2,item3,report;

		double price1,price2,price3,totalPrice;
		
		System.out.println("Enter item1 and its price: ");
		item1=scan.next();
		price1 = scan.nextDouble();
		
		System.out.println("Enter item2 and its price: ");
		item2 =scan.next();
		price2 = scan.nextDouble();
		
		System.out.println("Enter item3 and its price: ");
		item3 = scan.next();
		price3 = scan.nextDouble();
		
	  
	   
	   System.out.println("Item1:"+item1+" Price:"+price1+","+"Item2:"+item2+" Price:"+price2+","+
	                      "Item3:"+item3+" Price"+price3+",");
	   
	   
	   totalPrice = price1+price2+price3;
	   System.out.println("Total Price: "+totalPrice);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
