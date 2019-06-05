package day_10;

import java.util.Scanner;

public class CreditScoreRating {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score: ");
		int creditScore = scan.nextInt();
		
		//  excellent - when score is 750  - 850
		//  good -  when score is 700-749
		// fair - when score is 650 - 699
		// poor - when score is 550 - 649
		// bad - when score is 550 or less
		
		
		if(creditScore>750 && creditScore<850) {
			System.out.println("Excellent");
		}else if(creditScore>=700 && creditScore<=749) {
			System.out.println("good");
		}else if(creditScore>=650 && creditScore<=699) {
			System.out.println("fair");
		}else if(creditScore>=550 && creditScore<=649) {
			System.out.println("poor");
		}else if(creditScore<=550) {
			System.out.println("bad");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
