package Day_54;

class lion{  
// now we are gonna create constructor with one argument . this is not gonna be default constructor 
public lion(int a) {  // if super class constructor is not default you have to call it on sub class constructor 
	
}
	 
}

public class Constructor_Practice2 extends lion{ // while we are extends super class name(lion) it is gonna give us 
	// error compiler because it needs call super class constructor from sub class constructor  . only and only 
	// constructor can call constructor 
	//after all we need to create object and use super() keyword for to call with argument from super class constructor
	Constructor_Practice2(){
		super(10);
	}
	
	
	
	
}
