package day_38;

import java.util.ArrayList;

public class ContainsMethod {
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		list.add("Jan");
		list.add("feb");
		list.add("mar");
		list.add("apr");
		list.add("may");
		
		
		
		System.out.println(list.toString());
		
		
		
		ArrayList<String>month = new ArrayList<>(list);
		
		System.out.println(month);
		
		
		month.add("June");
		month.add("July");
		month.add("Agust");
		
		System.out.println(month);
		System.out.println(month.contains("June"));
		
		System.out.println(month.contains("dec"));
		
		
		ArrayList<String>month2 = new ArrayList<>(list);
		System.out.println(month.toString());
		
		
		
		System.out.println(month2.toString());
		
		System.out.println(month.size()==month2.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
