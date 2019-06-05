package Day_54;
//super class no args constructor is called in sub class constructor by default
class Animals{
	
	 public Animals() {
		 System.out.println("Tiger");
	 }
	
}

public class Constructor_super1 extends Animals {
	// if we dont extends sub class and when we try to executed after we create object nothing will come to output
	// but if we will extends sub class with super class then we will see "tiger" on consule 
	//  constructor can not be inherited . 
	//the reason we get the "tiger" here is because 
	//super class default constructor call in the sub class by the default compiler.
	

//	public Constructor_super1() { 
//		super();
//	} even we can use sub class for calling parent class constructor with "super()" keyword. but if we dont call it with
	// this subclass and with super() keyword still we will get "Tiger" because parent class constructor is default
	
	
	// if we have 2 constructor 
	
	
	public Constructor_super1() {
		super();
	}
	
	public Constructor_super1(int a) {
		super();
	}
	
	public Constructor_super1(double b) {
		super();
	}
	
	 //  even we will write alots of constructor with parameters in sub class and even we will declare these parameters
	// in object which we create in main method , still it is gonna give us "tiger " . nothing else 
	// because  in parent class we have default constructor . if we will have constructor with arguments then we can 
	// declare anything we want  on object  .
	// as long as you have default constructor in super class it going to be call this default on sub class .
	
	// default constructor always call in sub class even we dont create constructor with super() keyword 
	
	
	public static void main(String[] args) {
		new Constructor_super1(10);
		
		
		
		
	}
	
}
