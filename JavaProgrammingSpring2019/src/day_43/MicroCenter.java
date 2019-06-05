package day_43;

public class MicroCenter {
public static void main(String[] args) {
	
	 Computer comp1 = new Computer();
	 Computer comp2 = new Computer();
	 
	 
	 System.out.println(comp1.toString());
	 System.out.println(comp2.toString());
	 
	 comp1.setBrand("windows");
	 comp1.setOs("i7");
	 comp1.setPrice(800);
	 
	 comp2.setBrand("iMac");
	 comp2.setOs("macOS");
	 comp2.setPrice(2500);
	 System.out.println(comp1.toString());
	 System.out.println(comp2.toString());
	 
	 Computer comp3 = new Computer("Asus","i5",655.44);
	 System.out.println(comp3.toString());
	
	 comp3.setPrice(200.0);
	 System.out.println(comp3.toString());
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
     }


}
