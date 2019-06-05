package day_15;

public class IndexOf {
public static void main(String[] args) {
	
	String word1 = "github";
	
	System.out.println(word1.indexOf("g"));
	System.out.println(word1.indexOf("i"));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("ub"));
	System.out.println(word1.indexOf("java"));
	
	
	String url = "www.okta.com";
	System.out.println(url.indexOf("."));
	
	int index = url.indexOf("k");
	System.out.println(index);
	System.out.println(url.charAt(index+1));
	
	String title = "Java - Google Search";
	// find position of '-' and check if space is on rigth and left sides
	
	
	int idx = title.indexOf("-");
	System.out.println(idx);
	
	System.out.println(title.charAt(idx-1));
	System.out.println(title.charAt(idx+1));
	System.out.println(title.charAt(idx+3));
	
	String country = "United States of America";
	
	int states = country.indexOf("States");
	System.out.println(states);
	
	String word2 = "java , c++ , python , tomtac , eclipse";
	// check if c++ is in the word2
	
	System.out.println(word2.contains("c++"));
	
	// use indexOf
	
	int word = word2.indexOf("c++");
	System.out.println(word);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
