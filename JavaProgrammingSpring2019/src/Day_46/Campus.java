package Day_46;

public class Campus {
	String city;
	
	static {
		System.out.println("static block");
	}

	  
	
	    public Campus(String city) {
	    	System.out.println("Constructor");
		this.city = city;
	}

		
	    
		public String toString() {
			return "Campus [city=" + city + "]";
		}

		 
		


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}
	    
	    
	    
	    
	    
	    
}
