package Day_54;

public class practices {

	  public practices(int a, double d , boolean b) {
		  System.out.println("Number is: "+a);
		  System.out.println("GPA is: "+d);
		  System.out.println("Passed: "+b);
		  
	  }
	  public static void main(String[] args) {
		
		   practices obj = new practices(100,4.2,false);
		   
		   child obj2 = new child();
		  
		  
	}
}

 class child extends practices{
	 public child() {
		 super(200,6.4,true);
	 }
 }