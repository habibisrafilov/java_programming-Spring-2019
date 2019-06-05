package this_is_for_practises;

public class Son extends Father {

	  public Son() {
		  super("this is for calling empty constructor");
	  }
	  
	  public Son(String name) {
		  super("Chingiz");
	  }
	  
	  public Son(String name,int age) {
		  super("Chingiz",65);
	  }
	  
	  public Son(String name,int age,double height) {
		  super("Chingiz",65,1.75);
	  }
	  
	  public Son(String name , int age, double height,double weight) {
		  super("Chingiz",65,1.75,110.20);
	  }
	  public Son(String name,int age,double height,double weight,String jobTitle) {
		  super("Chingiz",65,1.75,110.20,"Teacher");
	  }
	  
	  
	  
}
