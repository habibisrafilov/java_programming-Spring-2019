package Day_52;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		
		 final int [] TEAMS = {11,11};
		 System.out.println("Team1: "+TEAMS[0]);
		 System.out.println("Team2: "+TEAMS[1]);
		 
		 TEAMS[0] = 10;
		 TEAMS[1] = 9;
		 
		 System.out.println("Team1: "+TEAMS[0]);
		 System.out.println("Team2: "+TEAMS[1]);
		 
		  final int [] nums = new int[] {34,21,56};
		 System.out.println(Arrays.toString(nums));
		 // int [] nums = new int [] {5,36,6456,7,76,634,42,476};
		 //System.out.println(Arrays.toString(nums));
		 
		  nums[1] = 77;
		 System.out.println(Arrays.toString(nums));
		 
		 
		 
		 final double[] PRICES = new double[3];
		 PRICES[0] = 85.5;
		 PRICES[1] = 99.99;
		 PRICES[2]= 99.98;
		 System.out.println(Arrays.toString(PRICES));
		 PRICES[1] = 20.20;
		 System.out.println(Arrays.toString(PRICES));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
