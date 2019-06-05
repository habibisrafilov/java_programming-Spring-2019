package Day_41;

public class CapitalOne {
public static void main(String[] args) {
	
	BankAccount bank1 = new BankAccount();
	
	bank1.accountHolder = "Habib Israfilov";
	bank1.accountNumber = 1122334455;
	bank1.balance = 500;
	
	bank1.deposit(500);
	bank1.showBalance();
	
	System.out.println("############$$$$$$$$$$$$%%%%%%%%%%%%%%@@@@@@@@@@@@@");
	
	bank1.withdraw(900);
	bank1.showBalance();
	
	bank1.charge(40, "Wings");
	bank1.showBalance();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   }
}
