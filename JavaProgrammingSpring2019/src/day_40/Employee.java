package day_40;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println("Employees have  a name: "+name+" and also he has a job title: "+jobTitle+" and of course salary: "+salary);
		
	}
	
	public void goToBreak() {
		System.out.println("Sometimes employee: "+name+" needs to go break but he also asking his : "+salary);
	}
	
	    public void attendMeeting() {
	    	System.out.println("Attending meeting is depends on salary: "+salary+"and name: "+name);
	    	
	    }
	    public void introduce() {
	    	String a1 = "Name[ "+name+"] "+"jobTitle[ "+jobTitle+" ]"+"salary[ "+salary+"]";
	    	System.out.println(a1);
	    }
	
}