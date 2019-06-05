package Day_16;

public class ReplaceThem {
public static void main(String[] args) {
	
	String sentence = "Coding is fun,it is my hobby!";
	String withNoSpaces = sentence.replace(" ", "");
	System.out.println(sentence);
	System.out.println(withNoSpaces);
	
	System.out.println(sentence);
	
	// replace ,with !
	System.out.println(sentence.replace(",", "!"));
	
	
	
	String mixed = "24074969644339%%^&**&^%";
	
	System.out.println(mixed.replace("644339%%", "java"));
	
	String word2 = "&&&%%java##@@!";
	System.out.println(word2.replace("%%", " "));
	
	System.out.println(word2.replace("&&&", " "));
	
	System.out.println(word2.replace("##", " ").replace("&&&", " ").replace("%%", " ").replace("@@!", " "));
	
	System.out.println(word2);
	
	word2 = word2.replace("&&&", " ");
	word2 = word2.replace("%%", " ");
	word2 = word2.replace("##@@!"," ");
	System.out.println(word2);
	
	
	String result = "About 155,000,000 result(0.59 seconds)";
	
	// using replace , get number of results
	
	// 155,000,000 
	 
	result = result.replace("About ", "");
	result = result.replace(",", "");
	result = result.replace("result(", "");
	result = result.replace(" seconds)", "");
	System.out.println(result);
	
	
	
	
	
	
	
}
}
