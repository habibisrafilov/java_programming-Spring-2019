package day09_stringequals_conditionals;

import java.util.Scanner;

public class Citizens {
	public static void main(String[] args) {
		// declare int variables : seniourCitizens, nonSeniorCitizens , age
		
	int seniourCitizens , nonSeniorCitizens ;
    int age ;
    // create a scanner
    
    Scanner scan = new Scanner(System.in);
    
  // // Ask user to enter count for seniourCitizens and nonSeniorCitizens using message:
    
    System.out.println("Enter current count for seniourCitizens and nonSeniorCitizens :");
	seniourCitizens = scan.nextInt();
	nonSeniorCitizens =scan.nextInt();
	
	System.out.println("What is new citizen's age?");
	age = scan.nextInt();
	
	if(age>=65) {
		System.out.println("Senior Citizens");
		seniourCitizens++;
	}else {
		System.out.println("Non-Seniour Citizen");
		nonSeniorCitizens++;
		
	}
	
	System.out.println("New seniourCitizens count: "+seniourCitizens);
	System.out.println("New nonSeniorCitizens: "+nonSeniorCitizens);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}






