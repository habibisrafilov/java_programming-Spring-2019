package Day_48_inheritance01;

public class Company {
public static void main(String[] args) {
	
	Employee em1 = new Employee();
	
	em1.name = "Marufjon";
	em1.jobTitle = "teacher";
	em1.gender = 'm';
	em1.age = 22;
	
	Employee em2 = new Employee();
	
	em2.name = "kiki";
	em2.age = 26;
	em2.gender = 'f';
	em2.jobTitle = "HR";
	
	em1.work();
	em2.work();
	
	em1.walk();
	em2.walk();
	
	em1.eat("chiken");
	em2.eat("salad");
	
	em1.sleep(5);
	em2.sleep(8);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
