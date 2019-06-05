package Day_52;

public class FinalMethods {

	 public final void method1() {
		 System.out.println("Final method 1");
		 
	 }
}

  class sub extends FinalMethods{
	  public void method1(String name) {
		  System.out.println("overloaded method1");
	  }
//	  public  void method1() {
//			 System.out.println("Overrided method 1");
//			 
//		 }
	  
  }
