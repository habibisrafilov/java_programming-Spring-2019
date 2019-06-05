package Day_46;

public class Ebay {
	public static void main(String[] args) {
		
		Customer cm1 = new Customer("Abdallah Aleies","AbdallahAleies@gmail.com");
		Customer cm2 = new Customer("Adilet Kyrgyz", "Adilet@yahoo.com");
		Customer cm3 = new Customer("Anastasiya Zasibna", "Anastasiya@outlook.com");
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer("Bural", "Ucal");
		System.out.println("Total customers: "+Customer.count);
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		
	}

}
