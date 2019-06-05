package day_40;

public class MyContacts {
	public static void main(String[] args) {
		
		 // create Contact object
		
		Contact contact1 = new Contact();
		contact1.name = "Evgenia Gelilova";
		contact1.phoneNumber = "202 555-4433";
		contact1.email = "Evgenia@cybertek.com";
		
		contact1.call();
		contact1.sendMessage(); 
		contact1.sendEmail(); 
		
		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "412 - 445 - 4646";
		orhan.email = "orhan@google.com";
		
		
		System.out.println("Name : "+orhan.name);
		System.out.println("PhoneNumber: "+orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		
		
		System.out.println("##################################################");
		System.out.println();
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		System.out.println();
		contact1.call();
		contact1.sendMessage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
	}

}
