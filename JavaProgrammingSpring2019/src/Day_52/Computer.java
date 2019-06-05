package Day_52;

public class Computer {

	  private String model;
	  private String color;
	  
	  
	    public boolean equals(Computer other) {
	    	if(model.equals(other.model) && 
	    	   color.equals(other.color)) {
	    		 return true;
	    	}
	    	return false;
	    }

	public Computer(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	  
	  
}
