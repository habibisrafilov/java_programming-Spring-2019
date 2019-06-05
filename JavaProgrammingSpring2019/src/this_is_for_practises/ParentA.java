package this_is_for_practises;

public class ParentA {

	private String word;
	private int number;
	public static int count;
	
	public static void buildAMap(String cityName) {
		System.out.println("I come from "+cityName);
	}
	
	static void tellMeYourCountry(String countryName) {
		System.out.println("My country name is "+countryName);
	}
	

	
	 public ParentA(String word) {
		 System.out.println("one args constructor");
		 this.word = word;
	 }
	
	public ParentA(String word,int number) {
		System.out.println("2 args constructor");
		this.word = word;
		this.number = number;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		ParentA.count = count;
	}
	
	
	
	
	
	  
}
