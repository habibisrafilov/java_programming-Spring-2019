package Day_28;

import java.util.Arrays;

public class Soccer_Team {
	public static void main(String[] args) {
		
		
		String[][] teams = new String[2][6];
		teams[0][0] ="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="Cihan";
		teams[0][3]="Habib";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		
		teams[1][0]="Olimjon";
		teams[1][1]="Mirshod";		
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dimitriy";
		
		
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][5]);
		System.out.println(teams[1][2]);
		
		System.out.println("numbers of team : "+teams.length);
		System.out.println("people of the first team: "+teams[0].length);
		System.out.println("people of second team: "+teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		
		
	  int [][] numbers = new int[3][4];
	  
	   numbers[0][0]=100;
	   numbers[0][1]=500;
	   numbers[0][2]=1234;
	   numbers[0][3]=5434;
	   
	   numbers[1][0]=54544;
	   numbers[1][1]=4644;
	   numbers[1][2]=122;
	   numbers[1][3]=9989;
	   
	   
	   numbers[2][0]=5454;
	   numbers[2][1]=444;
	   numbers[2][2]=1212;
	   numbers[2][3]=999;
	   
	   
	   System.out.println(Arrays.deepToString(numbers));
	   System.out.println(Arrays.toString(numbers[0]));
	   
	   int [][] scores = { {3,5,10},{6,4,2,10} };
	   
	   System.out.println("Days played/Number of arrays "+scores.length);
	   System.out.println("Numbers of Values in 1: "+scores[0].length);
	   System.out.println("Numbers of Values in 2: "+scores[1].length);
		
	   
	   int [][]  values = new int[4][];
	   values[0]= new int[] {34,23,5};
	   values[1]=new int[] {34,566,76,445,34,2,6,95,4,545};
	  
	   values[2]=new int[2];
	   values[2][0]=55;
	   values[2][1]=88;
	   
	   
	   values[3]=new int[]{45,5,12,21,3};
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
