package Day_46;

public class Customer {
	private String name;
	private String email;
	
	public Customer() {
		System.out.println("no args Constructors");
		name = "undefined";
		email = "undefined";
	}
	
	 public Customer(String name,String email) {
		 System.out.println("2 args Constructors");
		this.name = name;
		this.email = email;
		 
	 }
	 
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
    
}
