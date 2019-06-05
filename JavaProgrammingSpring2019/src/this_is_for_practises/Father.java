package this_is_for_practises;

public class Father {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private String jobTitle;
	
	public static void workPlace(String schoolName) {
		System.out.println("Chingiz is working at the "+schoolName+" school");
	}
	
	public static void howLongWorkingAtSchool(int yearOfWorking) {
		System.out.println("Chingiz is working at the school since "+yearOfWorking);
	}
	
	public Father(String name) {
		this.name = name;
	}
	
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Father(String name , int age , double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Father(String name , int age , double height,double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Father(String name , int age , double height,double weight,String jobTitle) {
	    this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;  
		this.jobTitle = jobTitle; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	

}
