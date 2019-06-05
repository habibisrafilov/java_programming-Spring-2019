package day_38;
import java.util.*;
public class CollectionsSorting {
public static void main(String[] args) {
	
	
	List<Integer>numsList = new ArrayList<>();
	numsList.add(44);
	numsList.add(1);
	numsList.add(4);
	numsList.add(1000);
	numsList.add(3);
	
	
	System.out.println(numsList);
	
	Collections.sort(numsList);
	System.out.println(numsList);
	
	
	List<String>strList = new ArrayList<>();
	
	strList.add("java");
	strList.add("roman");
	strList.add("murad");
	strList.add("muhammad");
	strList.add("olimjon");
	strList.add("dina");
	
	
	Collections.sort(strList);
	System.out.println(strList);
	
	int maxNum = Collections.max(numsList);
	int minNum = Collections.min(numsList);
	
	System.out.println(maxNum+" "+minNum);
	
	String maxName = Collections.max(strList);
	String minName = Collections.min(strList);
	
	
	System.out.println(maxName);
	System.out.println(minName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
