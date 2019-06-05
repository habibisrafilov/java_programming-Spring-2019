package day_26;

import java.util.Arrays;
import java.util.Random;

public class names {
	public static void main(String[] args) {
		
		String[] names= {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		
		System.out.println("Total name: "+names.length);
		
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length;i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
			
		}
		
		 System.out.println("MALE NAMES: ");
		 for(int m=0; m<names.length; m+=2) {
			 System.out.print(names[m]+", ");
		 }
		
		   System.out.println("FEMALE NAMES: ");
		
		for(int b=1;b<names.length; b++) {
			if(b%2==1) {
				if(b==names.length-1) {
					System.out.println(b);
				}
				else {
					
				System.out.print(names[b]+", ");
			}
				
			}
			
		}
		
		
		
		System.out.println(names[20]);
		
		
		Random random = new Random();
		
		int r = random.nextInt(names.length);
		System.out.println("random name: "+names[r]);
		
		for(String name:names) {
			if(name.length()<=4) {
				System.out.print(name.toUpperCase()+", ");
			}
		}
		
		
		String namesto4="";
        String names5to6="";
		String names7orMore="";
		
		 for(String name:names) {
			 
			if(name.length()<=4){
				namesto4+=name+", ";
			}else if(name.length()==5 && name.length()==6) {
				names5to6+=name+", ";
			}else {
				names7orMore+=name+", ";
					
				
				
				
			}
		
			System.out.println(namesto4);
			System.out.println(names5to6);
			System.out.println(names7orMore);
			
			
		}
		 
		 
		 System.out.println(Arrays.toString(names));
		 
		 
	
	for(int i=0 ; i<names.length; i+=2) {
		String temp = names[i];
		names[i]= names[i+1];
		
	}
		 
		
		 
		
		
	}

}
