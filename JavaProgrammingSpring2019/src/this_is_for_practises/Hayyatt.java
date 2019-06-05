package this_is_for_practises;

public class Hayyatt {
	public static void main(String[] args) {
		
		
//		String name;
//		int  star;
//		int floor;
//		boolean isYesPool;
//		double price;
//		boolean CheapOrExpensive;
//		String owner;
		
		Hotel hl1 = new Hotel();
		
		hl1.name = "Hayyatt";
		hl1.star = 5;
		hl1.floor = 16;
		hl1.isYesPool = true;
		hl1.price = 200;
		hl1.CheapOrExpensive = false;
		hl1.owner = "Habib Israfilov";
		
		hl1.stayAtHotel("Pittsburgh", 80);
		hl1.outState("Azerbaijan", 12);
		hl1.usingBoolean("cheapOrExpensive");
		
	}

}
