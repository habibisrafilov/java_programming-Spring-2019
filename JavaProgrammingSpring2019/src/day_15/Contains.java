
package day_15;

import java.util.*;
public class  Contains{
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    
    String email = "test@gmail.com";
    
   System.out.println(email.contains("@"));
    
   String list = "potatos,apples,tomatos ,eggs,milk,bread , cerial";
   
   // check if apples is the shopping list
   // true - apples are there 
   // false - lets add apples
   
   System.out.println(list.contains("apples"));
   
   if(list.contains("apples")) {
	   System.out.println("apples is there");
   }else {
	   System.out.println("lets add apples");
   }
   
   boolean hasEggs = list.contains("eggs");
    System.out.println(hasEggs);
   
   boolean hasCucamber = list.contains("cucamber");
   System.out.println(hasCucamber);
   
   email = "@yahoo.com";
   
   if(email.contains("yahoo")) {
	   System.out.println("it is yahoo email");
   }
   
   String etsyTitle = "Wooden spoon | Etsy";
   
   if(etsyTitle.contains("|")) {
	   System.out.println("pipe is there");
   }else {
	   System.out.println("pipe is not there ");
   }
   // assign your name and check if it contains "a" or "e" letter
   String name = "Habib";
   
   if(name.contains("a") && name.contains("e")) {
	   System.out.println("this is my name ");
   }else {
	   System.out.println("it is not my name");
   }
   
   
   
   
   
   
   
    
}
}
