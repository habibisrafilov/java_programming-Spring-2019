package day_43;

public class Tesla {
	
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		
		this.model = model;
		
	}
	
	 public String getModel() {
		 
		 return model;
		 
	 }
	 
	 public void setRange(int range) {
		 this.range = range;
	 }
	 
	 public int getRange() {
		 return range;
	 }
	 
	 public void setZeroTo60(double zeroTo60) {
		 this.zeroTo60 = zeroTo60;
	 }
	 
	 public double getZeroTo60() {
		 return zeroTo60;
	 }
	 
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 
	 public double getPrice() {
		 return price;
	 }
	 
	 public void setSelfDriving(boolean selfDriving) {
		 this.selfDriving = selfDriving;
	 }
	 
	 public boolean getSelfDriving() {
		 return selfDriving;
	 }
	 
	 public boolean isValidModel(String model) {
		 model = model;
		 if(model.equals("modedl s") || model.equals("model 3") || model.equals("roadster")) {
			 return true;
		 }
		 return false;
	 }
	 
	 public void setTeslaInfo(String model,int range,double zeroTo60,double price,boolean selfDriving) {
		  setModel(model);
		  setRange(range);
		  this.zeroTo60 = zeroTo60;
		  this.price = price;
		  setSelfDriving(selfDriving);
		  
	 }
	 
	 
	
}
