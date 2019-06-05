package Day_54;
//  final class cannot be extented.
class parent{
	// we have class variables .  what is the difference between instance variable to class variable ?
	static int num1; // class variable .  it belong to class . inheritable
	int num2 ; // instance veriable .  instance variable belongs to the object 
	// instance variable can be inherited in sub class
	
	public void mehthod() { // instance method
		
	}
	
	protected void proMethod() {   
		System.out.println("protected");
	}
	
	public static void method2() {   //  static method
		System.out.println("mehtod2");
	}
	
	parent(){  // constructor , can not be inherited
		System.out.println("Constructor");
	}
	
	static { // static block . static block is ready for exucuted as soon as class is loaded.belongs to class
		// how many times static block can be exucuted for per class  ? only  one .
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block"); // it only exucuted when you create object
		// init(instance) block is belong to object . instance block to be exucuted depends on how many object it has.
	}
	
	private void methodB() {  //  this is private with instance method
		// private can not inherited in sub class . because  anything with private means that this variable and method
		// is not visible in outside of class  
	}
	
	// feature can not be inherited  .  1. constructor ,
	                                  //2. private
	                                  //3.defult can not be inherited when sub class and super class are in different package
}

   // sub class can only have on esuper class 
  // but parent class can extends other than one subclass
public class InheritanceReview extends parent{
	           // subclass          // super class
	
	// we can call instance method and static method in the sub class 
	
	public static void main(String[] args) {
		
//		System.out.println(num1);
//		System.out.println(new InheritanceReview().num2);
//		System.out.println(new parent().num2);
		// static block is gonna be exucuted even we dont create Object class because this block is inherited.
		// when we create the object init block and constructor  block can be exucuted 
		// instance block is exucuted first then constructor  .
		// constructor is not inheritable. 
		//when we excucuted constructor in sub class parent class give us empty constructor by defult
		// private is also is not inheritable  
		
		// instance block instance method ,instance variable  static block,  static method , class variable are inheritable 
		
		new InheritanceReview();
	}
	
	public void method() {
		
	}
	 

}
