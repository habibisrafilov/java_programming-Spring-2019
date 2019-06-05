package Day_44;

public class Job {
	private String title;
	private String company;
	private double annualSalary;
	
	
	
  public Job(){
	  System.out.println("No-args constructor");
	  this.title = "undefinent";
	  this.company = "undefinent";
	  this.annualSalary = 0.0;
  }
	
	public Job(String title) {
		System.out.println("1 args constructor");
		this.title = title;
		this.company = "undefinent";
		 this.annualSalary = 0.0;
	}
	
	public Job(String title,String company) {
		System.out.println("2 args constructor");
		this.title = title;
		this.company=company;
		this.annualSalary = 0.0;
	}
	
	public Job(String title,String company,double annualSalary) {
		setTitle(title);
		setCompany(company);
		System.out.println("3 args constructor");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
		
	}
	
	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	

}
