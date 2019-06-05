package Day_44;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		
		Job job1 = new Job();
		Job job2 = new Job("Developer");
		Job job3 = new Job("SDET","Google");
		Job job4 = new Job("PO","Apple",130000.0);
		
		System.out.println(job1);
		System.out.println(job2);
		System.out.println(job3);
		System.out.println(job4);
		
		// create a list of jobs and add a 5 different jobs with title,company,salary.
		
		ArrayList<Job>jobsList = new ArrayList<>();
		
		jobsList.add(job4);
		jobsList.add(new Job("scrum master","google",123000));
		jobsList.add(new Job("ba","freddiemac",150000));
		jobsList.add(new Job("qa tester", "delta",140000));
			
		System.out.println(jobsList);
		
		// find the highest paying job and print toString for that
		
		double maxSalary = 0;
		int highestIndex = -1;
		
		for(int i=0; i<jobsList.size(); i++) {
			if(jobsList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
				
			}
		}
		
		System.out.println("Highest Salary: "+jobsList.get(highestIndex));
		
		
		
	}
}
