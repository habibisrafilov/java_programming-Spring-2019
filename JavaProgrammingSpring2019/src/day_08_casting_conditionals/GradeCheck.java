package day_08_casting_conditionals;
// pseudocode
import java.util.Scanner;
public class GradeCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// A, B, C, D
		// char grade = scan.next().charAt(0);
		// if grade is 'A' =>
		// excelent job! keep it up!
	    //  else
		
		 // how many point did you miss for 'A' ?
		// int point = scanner
		// print"your grade B is not good enough"
		//"you could earn 10 more points if you studied harder"
		
		System.out.println("What is your grade");
		char grade = scan.next().charAt(0);
		
		
		
		if(grade =='A') {
			System.out.println("Excelent job!");
		}else {
			System.out.println("How many point did you miss for 'A' ");
			int point = scan.nextInt();
			System.out.println("you could earn " +point+" more points if you studied harder");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
