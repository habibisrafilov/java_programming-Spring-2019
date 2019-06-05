package day_40;

public class MyWork {
	public static void main(String[] args) {
		
		Employee worker1 = new Employee();
		
		worker1.name = "Habib";
		worker1.jobTitle = "QA Engineer";
		worker1.salary = 120000;
		
		System.out.println("Employeer name is : "+worker1.name);
		System.out.println("His job title is: "+worker1.jobTitle);
		System.out.println("and also salary is: "+worker1.salary);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		
		worker1.work();
		worker1.goToBreak();
		worker1.attendMeeting();
		
		worker1.introduce();
	}

}
