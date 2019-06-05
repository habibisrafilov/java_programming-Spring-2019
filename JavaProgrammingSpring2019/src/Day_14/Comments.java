package Day_14;

public class Comments {
public static void main(String[] args) {
	
//	Class vs Object overview
//	Strings manipulation
//	=========================
//
//	Primitives are foundation for all other types and come built in with Java.
//
//	Primitives have only VALUE and do not have any behaviour.
//
//	int n = 10;
//
//	n.add(100); will not work since primitives are just values without behaviour/actions.
//
//	boolean b = true;
//	System.out.println(b);
//	if(b == true){}
//
//	WILL NOT WORK:
//	System.out.println(b.reverse());
//	if(b.equals(true)){}
//
//	char ch = 'v';
//	ch = 'V';
//
//	ch.toLowerCase(), any other behaviour/action is not possible.
//
//	PRIMITIVES ARE JUST A SINGLE VALUE WITHOUT ACTION.
//
//	double price = 34.6;
//
//	double price2 = price * 2;
//	===================================
//
//	CLASS HAS 2 MAIN COMPONENTS:
//
//	1) Data. Can store single or multiple sets of data in one class.
//	2) Behaviour. It can have any number of actions/ METHODS.
//
//	String str = "hello";
//	println(str.toUpperCase());
//
//	CellPhone class/Template:
//	1) Data: ScreenSize, Model, isTouchScreen, Store, Ram, CPU, OS, hasCamera
//
//	2) Call, Message, Sendemail, takeSelfies, BrowseInternet......
//
//
//	The above is the description/ blueprint for any phone.
//	From that blueprint/class, we can CREATE OBJECTS.
//	==================================================
//
//
//	2 MAIN DATA TYPES IN JAVA:
//
//	1) PRIMITIVES (8) => SINGLE PIECE OF DATA AND NO ACTION/BEHAVIOUR/METHOD
//
//	2) CLASS TYPE/ OBJECTS/ NON-PRIMITIVES:
//	1) Data/Attribute
//	2) Behaviour/Actions/methods ==> can do something.
//
//
//	class Computer
//	attributes: Model, MemorySize, CPU Type, Storage, ScreenSize, Color
//
//	methods/behaviour: turnOn, turnOf, Open/Close, CodeJava, type, ......
//	=================================
//
//	In Java, there are many ready classes that we can use.
//	=> String, Scanner, many more thousands
//	=> System.out.println();
//
//	==> We can create CUSTOM/YOUR OWN classes.
//
//	public class Computer {
//	//
//	//
//	}
//	===================================
//
//
//	String class
//	=> String objects
//
//	1) Value/Data ==> "value"
//	2) Behaviour/ can perform actions on the Value/
//	String class methods
//
//	String name = "Bobby";
//	println(name.toUpperCase()); //"BOBBY"
//	=========================================
//
//	String sentence = "Java is fun";
//
//	String str = "Java";
//
//	0 1 2 3
//	'J''a''v''a'
//
//	String value INTERNALLY is a combination of CHARs.
//	each Char has its position/INDEX. Starts count from 0.
//
//	String country = "USA";
//
//	0 1 2
//	'U''S''A'
//	===================================================
//
//	STRING BUILT IN METHODS:
//
//	String str = "Test";
//
//	EQUALITY TEST:
//	- str.equals("test") => false
//	- str.equalsIgnoreCase("test") => true
//
//
//	'T''e''s''T'
//	't''e''s''t'
//	'e''t''s''t'
//
//	CASE CONVERSION:
//	- toUpperCase
//	- toLowerCase
//
//	 
//
//	package day14_string_methods
//
//	Task:
//	Words
//	Using scanner accept word1 anb word2
//
//	and compare their lengths
//
//	1-word1 is longer ==> "word1Value is longer"
//	2-word2 is longer ==> "word2Value is longer"
//	3-same length ==> "word1Value and word2Value are same length"
//
//	STRING METHODS:
//	equals, equalsIgnoreCase, toUpperCase, toLowerCase, length,
//
//
//	CHARAT ==> charAt(number) ==> 
//	Goes to String value and returns the character that that position/index.
//
//
//	String word = "Epson";
//
//	0 1 2 3 4
//	'E''p''s''o''n'
//
//	word.charAt(0) ==> 'E'
//	word.charAt(1) ==> 'p'
//	word.charAt(2) ==> 's'
//	word.charAt(3) ==> 'o'
//	word.charAt(4) ==> 'n'
//	word.charAt(5) ==> IndexOutOfBounds Exception
	
}
}
