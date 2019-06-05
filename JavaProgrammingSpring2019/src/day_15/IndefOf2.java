package day_15;

public class IndefOf2 {
	public static void main(String[] args) {
		
		// index of with 2 inputs
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("first dash: "+firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: "+secondDash);
		
		int thirdDash = list.indexOf("-", 14);
		System.out.println("Third dash: "+thirdDash);
		
		int fourthDash = list.indexOf("-", 22);
		System.out.println("Fourth Dash: "+fourthDash);
		
		String word1 = "habib";
		
		int firstLetter = word1.indexOf("b",3);
		System.out.println(firstLetter);
		
		String word2 = "bananakiwiapplebanana";
		
		int let = word2.indexOf("a");
		System.out.println(let);
		
		int let1 = word2.indexOf("a",2);
		System.out.println(let1);
		
		int let2 = word2.lastIndexOf("a");
		System.out.println(let2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
