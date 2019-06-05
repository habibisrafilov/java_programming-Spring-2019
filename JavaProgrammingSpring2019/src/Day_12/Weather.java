package Day_12;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weather : ");
		String weather = scan.next();
		
		switch(weather) {
		
		
		case "sunny":
			System.out.println("Go to park");
		           break;
		case "hot":
			System.out.println("Go swimming");
		           break;
		case "windy":
			System.out.println("Fly a kite");
		           break;
		case "rainy":
			System.out.println("Go shopping");
		           break;
		case "snow":
			System.out.println("Chain your tyres");
		           break;
		           default:
			
			
			System.out.println("Code java in any other weather");
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}

}
