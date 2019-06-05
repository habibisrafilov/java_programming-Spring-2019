package this_is_for_practises;

public class HAZL_Family {
	public static void main(String[] args) {
		
		
		Family hazl = new Family();
		
		hazl.mother = "Aytan";
		hazl.father = "Habib";
		hazl.sister1 = "Zeynab";
		hazl.sister2 = "Leyla";
		
		hazl.hazlFamily();
		
		Family israfilovs = new Family();
		israfilovs.father = "Chingiz";
		israfilovs.mother = "Zumrud";
		israfilovs.sister1 = "Firuza";
		israfilovs.sister2 = "Gunay";
		israfilovs.sister3 = "Firangiz";
		israfilovs.brother = "Habib";
		
		israfilovs.israfilovsFamily();
		israfilovs.newFamily("Habib");
		
		
		
		
	}
	
	
	
	 
	 

}
