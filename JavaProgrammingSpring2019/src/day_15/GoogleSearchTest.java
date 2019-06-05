package day_15;

public class GoogleSearchTest {
public static void main(String[] args) {
	
	String item = "java";
	String pageTitle = item+" - Google Search";
	
	//About 22,100,000 result(0.65 seconds)
	
	//  test if pageTitle starts with item 
	
	if(pageTitle.startsWith(item)) {
		System.out.println(item);
	}
	
	
	    if(pageTitle.endsWith("Search")) {
	    	System.out.println("passed");
	    }
	
	
        }



}
