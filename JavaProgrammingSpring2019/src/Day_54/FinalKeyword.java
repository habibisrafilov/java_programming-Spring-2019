package Day_54;

class data1{    // if you have 2 private data and one of them is final .
	           //  if you encapsulated those private datas how many setter and how many getter you need to create  ? 
	            // 2 getter and one setter . setter change the value . if private data is final u can not change the value
	
	 private String password = "123456";
	 private final int age = 40;
	 
	 // getter  -  accec modifier is public , how about return type : string or int  , then method name 
	 // dont need to pass parametr . 
	 // getter reads the data but setter modifay the data 
	 public String getPassword() {
		 return password;
	 }
	 
	 // setter 
	 public void setPassword(String password) {
		 this.password = password;
	 }
	
	 public int getAge() {
		 return age;
	 }
	    
//	 public void setAge(int age) {  // final variable can not have setter
//		 this.age =  age;
//	 }
	 
	 
	 
}

public class FinalKeyword {
	
	
	
	// final: value can not be changed
	// variable , class and methods
	
	// variables: local  , instance and class or static  variables
	
	  // local variable is belongs to the method . does not need to be initialized immediately
	  // if local variable is final we can not reassign this variable
	
	 // instance variable . it needs to be initialized immedietely . it belongs to the object . 
	// i can assgin this "name" in instance block 
	// instance variable needs to be initialized immedietly. can be initilized in either isntance block or constructor
	
	// static variable : needs to be initialized immediately . can be initialized in static block. 
	
	// class :  if class is final class can not be extended. abstract class can not be final 
	
	// method :  can not be override
	  final String name;
	  
	  {
		  name = "cybertek";
	  }
	  
//	  public finalKeyword() {
//		  //name = batch 13; // constructor can not exucuted because instance variabile assign first
//	  }
	  
	 // class or static veriable
	  
	   final static String school; 
	   // you can  initialized class veriables only in static block that are final 
	   
	   
	   static {
		   school = "Bach 13";
	   }
	  
	 public static void main(String[] args) {
	
	   final boolean result = false;  // if i make it final i can not reassign this result in next step
	   // result =true;  final variab;e can not be reassign
	   
	  
     
	   
	   
	   
	   
}

}
