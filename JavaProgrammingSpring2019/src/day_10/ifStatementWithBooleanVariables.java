package day_10;

import java.util.Scanner;
public class ifStatementWithBooleanVariables {

public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
	
   boolean isBreakTime = true;
   
   
   // first version 
   if(isBreakTime==true) {
	   System.out.println("right");
   }else {
	   System.out.println("false");
   }
 
   
    //  second version 
   
   if(isBreakTime) {
	   System.out.println("true");
   }else {
	   System.out.println("false");
   }
 
   boolean classTime = false;
   
   if(classTime) {
	   System.out.println("stop talking");
	   System.out.println("come back on time");
	   System.out.println("Pay Atention");
   }else {
	   System.out.println("have a nap");
   }
   
   
   boolean qualified = false ; 
   
   // send a notification message only if not qualified
   // we need to check if qualified variable contains false
   
   
   
   
   if(qualified) {
	   System.out.println("you qualified");
   }else {
	   System.out.println("you are not qualified");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}

}
