package PracticeForAll;

public class Sheep {
	public static void main(String[] args) {
		
		
		Meat mt1 = new Meat();
		System.out.println(mt1.toString());
		Meat mt2 = new Meat("Sheep");
		System.out.println(mt2.toString());
		Meat mt3 = new Meat("Cow", 120, 600);
		System.out.println(mt3.toString());
		
	}

}
