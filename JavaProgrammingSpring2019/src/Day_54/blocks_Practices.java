package Day_54;

public class blocks_Practices {
	
	static String names ;  // i have static  varuable and i want to inisilayz value
	//whenever we create class and if we run static in main method first static variable will run first
    //even we have instance block and constructor. but if we create object and we will run "names"
   // first we will see that constructor runs first.
	
	static {
		names = "Jhon";  // whitout creating the object only static block will exucuted 
	}
	

	{
		names = "Aaron";  // if we create object  then instance block will rant first but compiler will show us last ecucuted 
		                  //  that is why we will see constructor (murodil") in this case  
	}
	
	
	 blocks_Practices(){
		 names = "murodil";
	 }
	 
	 // now i will create instance variable
	 
	 int num1 = 10;
	 static int num2 =10;
	 
	 public static void main(String[] args) {
		System.out.println(names);
		
		  blocks_Practices obj = new blocks_Practices();
		   obj.num1 = 20;  // if we print it it is gonna give us 20 . 
		   obj.num2 = 20;
		  // static variable belongs to class but instance veriable belongs to object  
		   // inst variable we initialized 20 but if it is come second object is it gonna stay 20  ?
		   // it goes back defult value . it means it is gonna be 10  .
		     
		  blocks_Practices obj2 = new blocks_Practices();
		  System.out.println(obj2.num1);  // 10
		  System.out.println(obj2.num2);   // 20
		  
		  System.out.println(names);
		  
		  
		  
	}
	 
}
