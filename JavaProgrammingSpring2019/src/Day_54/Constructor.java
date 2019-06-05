package Day_54;

import Day_54.example1.example2;

// if you create the class you have empty constructor  . if you have it you can create object in main method 
class example1{
	
	public example1(int a) {  // if we declare any parametr it is not no args constructor , all the access modifaers you can 
		// give to the constructors  . 
		// constructor name must be same with class name  . we can not create constructor without giving class name  
		System.out.println("constructor args 1 ");
		
	}    // constructor can not have specifier and return type 
	    //  spesifiers: final , static , abstract
	    //  return - types: void,primitives , wrapper class and all objects
	    // constructor you can not have return type 
	    // we can not override constructor but we can overload it  
	
	// constructor can only call one constructor 
	 // for example:
	
//	   public example(int a) {  it is not gonna compailer because  we are trying to call 2 constructor in one method.
//		   this(500);
//		   this('A');
//		   
//	   }
	
	public example1(double a) {
		// how do we call constructor  ?  we need to use "this()" keyword
		this(300);
	}
	
	public example1(float a) { // can i call this constructor by itself ?
		this(19.5);
	}
	
	public example1(char a) {
		this((float)20f);
	}
	
	
	
//	public void methodE() { we can not call constructor with instance method . we can only call constructor in other constructor
	// with "this()" keyword.
//		this(300);
//		
//	}
	
	public class example2{
		
	}


public class Constructor {
	
	// Constructor in java is a special method but it is not same with regular method . 
	// constructor does not have  RETURN  type and method name.it has class name .
	//  constructor is belong to object . 
	// constructor  belongs to object . that is why it is gonna exucuted because  we are creating object 
	//   every class must have constructor. even you did not declare any constructor in class compiler will give 
	// you no args constructor  . it is also called defoud constructor 
	
	// can i call the constructor in the main method  ?

   public static void main(String [] args) {
	   example1 obj =  new example1(9); // if you create the object it does not mean that you are calling the constructor  .
	                                    // constructor execution depends on the creation of object (same with instance block)
	                                     // constructor executed after instance block 
	   // constructor can not called by constructor name .
	   // constructor can only be called in other constructors
	   
	   
	  // example2 obj2 = new example2();// when it is empty it is compayl because we have no args(defuld)constructor . 
	   // there is  defuld constructor exsist.
	     //example2 obj2 = new example2(100); but when i write any argument it is giving eror compailer because we dont have
	     // one arg constructor . because it is not exisyst in the constructor class 
	   
	   // in order  to creating object with orgument you need exsisting and visible constructor  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
	   
  }
   

