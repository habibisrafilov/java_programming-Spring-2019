package day_42;

public class Comments {
public static void main(String[] args) {
	
	
//	Custom classes and Encapsulation.
//	---------------------------------
//
//	Class and Object.
//	Class is a template/blueprint, where we define/add
//	variables, methods.
//
//	Then from the class, we can create multiple objects.
//	Each object will have its own copy of variables.
//
//	Class A
//	A -> obj1
//	-> obj2
//	.......
//	===========================
//
//	is is mandatory for a class to have variables and methods for it to compile?
//	public class Sublime {
//
//	}
//
//	Sublime sb = new Sublime();
//	===========================
//
//
//	package day42_customclasses_encapsulation
//
//	Coffee
//	instance variables:
//	- name
//	- size
//	- price 
//	- calories
//
//	Methods:
//	getCoffeeInfo
//	prints above data
//
//	setName
//	- void
//	- String newName
//	It will assign newName to name instance variable
//	- setter methods for other 3 variables.
//
//	setCoffeeInfo:
//	- void
//	- params: String newName,String newSize, double newPrice, int newCal
//	it will assign 4 values to 4 instance variables.
//
//	=========================
//
//	SETTER method, this method will help assign value to instance variable.
//
//	Another advantage of using setter methods can be checking if data is valid. If it is valid, then assign to instance variable, if not - show error message etc.
//	==========================
//
//	When we create classes, we can analyze our data and add them as instance variables.
//
//	Class is a template/blueprint for objects.
//
//	Object is created from a class, it is also called instance of the class.
//
//	class -> object(instance)
//	creation of object -> instantiation
//
//	I wrote a class then i need to instantiate it to use it.
//
//	public class SushiPlace {
//
//	}
//	SushiPlace mySushi = new SushiPlace();
//	======================================
//
//	in class we can declare INSTANCE/OBJECT Variables.
//	They will serve as a property of the class.
//	We declare inside the class and outside any method.
//
//	For ex:
//
//	public class SushiPlace {
//	String name;
//	double rating;
//	String address;
//	}
//	SushiPlace mySushi = new SushiPlace();
//	mySushi.name = "Horosho Sushi";
//	.....
//
//	We can also add behaviour to the class, by creating CUSTOM METHODS.
//
//	INSTANCE METHODS:
//	created inside the class and it is not static.
//
//	public class SushiPlace {
//	String name;
//	double rating;
//	String address;
//
//	public void setInfo(String nName, double nRating, String newAddress) {
//	name = nName;
//	rating = nRating;
//	address = newAddress;
//	}
//
//	public void eatSushi() {
//	System.out.println("Enjoying sushi at " + name);
//	}
//	}
//
//	--> instance method can be used to process/use the data
//	--> instance methods can use instance variables in same class
//	--> also serves as a behaviour for the class
//	================================================
//
//
//	SushiPlace mySushi = new SushiPlace();
//
//
//	SushiPlace[] sushiPlaces;
//	String[] names;
//
//	ArrayList<SushiPlace> list;
//	ArrayList<String> list;
//
//	==============================
//	### a class can have multiple data of different types.
//	Template with multiple data in it that are related to single object.
//
//	public class SushiPlace {
//	String name;
//	double rating;
//	String address;
//	}
//
//	SushiPlace s1 = new SushiPlace();
//	s1.name
//	s1.rating
//	s1.address
//	..........
//
//	How to use custom classes with arrays and arraylist.
//
//	Coffee[] coffeeArray = new Coffee[2];
//
//	coffeeArray can hold 2 Coffee objects.
//
//	public class Car {
//	String make;
//	}
//
//	Car car = new Car();
//
//	Car[] cars = new Car[3];
//	cars[0] = new Car();
//	cars[1] = new Car();
//	cars[2] = new Car();
//
//	cars[0].make = "Suzuki";
//	cars[1].make = "Subaru";
//	cars[2].make = "BMW";
//	=========================
//
//	Shoes
//	-> String brand
//	-> double size
//
//	Methods:
//	setShoesData(String newBrand, double nSize)
//
//	public String getShoesData() {
//	return brand + " | " + size;
//	}
//	========================================
//
//	4 DIFFERENT PRINCIPLES OF OOP.
//
//	A PIE
//	Abstraction
//	Polymorphism
//	Inheritance
//	Encapsulation
//
//	Encapsulation - is data hiding , meaning prevent access to class data to any other classes.
//
//	Access to the instance data will be ONLY in same class.
//
//	We make our variables private. 
//	public class Person {
//	private String phoneNumber;
//	}
//
//	private ==> only accessible in the same class
//	============
//	ACCESS MODIFIERS:
//
//	Access modifiers determine whether other classes can use a particular field or invoke a particular method
//
//	public -> visible/accessible to the world(all other classes in the project)
//
//	protected -> visible to anyone in same package, and ONLY visible to sub classes in different packages
//
//	default -> Package private - only visible/accessible to classes in same package
//
//	private -> Only visible/accessible in the same class
//	================================
//
//	Encapsulation process:
//	1) make instances private
//	2) grant access to private variables using public getter/setter methods
//
//	Advantage of using public getter/setter methods that we can control the data that is being assigned to encapsulated private variables.
//
//	We can use If statements to check for validity of data before assigning
//	============================
//
//	Summary:
//	- custom classes and methods
//	- how to assign values using public methods
//	- how to create arrays and arraylist using custom classes
//	- access modifiers
//	- encapsulation -> private access modifier
//	-> public getter and setter methods. accessor / mutator methods.
}
}
