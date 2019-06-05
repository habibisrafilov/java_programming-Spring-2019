package day_38;
import java.util.*;
public class MethodSummary {
	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		
		list.add(0,"yellow");
		
		
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.remove(0));
		System.out.println(list.toString());
		System.out.println(list.indexOf("grey"));
		System.out.println(list.indexOf("blue"));
	
		System.out.println(list.isEmpty());
		System.out.println(list.size()==0);
		System.out.println(list.contains("black"));
		System.out.println(list.contains("white"));
		
		
		List<String> list2 = new ArrayList<>();
		System.out.println(list2.addAll(list));
		
		
		list2.add("pink");
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
