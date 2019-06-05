package day_38;
import java.util.*;
public class RawArrayList {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	list.add("Saturday");
	list.add("java day");
	list.add(1000);
	list.add(44.32);
	list.add(true);
	list.add(false);
	
	System.out.println(list.toString());
	String allvalues = list.toString();
	System.out.println(allvalues);
	
	
	   System.out.println(list.get(0));
	   
	   list.get(1);
	   
	
  }


}
