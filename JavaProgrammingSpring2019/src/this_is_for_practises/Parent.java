package this_is_for_practises;

public class Parent {
	private String name;
	private int price;
	
	public Parent() {
		System.out.println("No args constructor");
	}

	  public Parent(String name) {
		  System.out.println("One args constructor");
		  this.name = name;
	  }
	  
	  public Parent(String name,int price) {
		  this.name = name;
		  this.price = price;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	  
	  
}
