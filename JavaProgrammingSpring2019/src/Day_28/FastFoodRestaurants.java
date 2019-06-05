package Day_28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		
	String [] players = {"Irina","Zarif","Cihan","Habib","Adel","Bojan"};
	
	String[][] teams= new String[2][6];
	
	teams[0][0]="Irina";
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
	teams[1][5]="Dmitriy";
      
		System.out.println(teams[0][2]);
		System.out.println(teams[1][4]);
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		
		System.out.println(teams[0].length);
		System.out.println(teams[1].length);
		System.out.println(teams.length);
		
		System.out.println(Arrays.toString(teams[1]));
		System.out.println(Arrays.deepToString(teams));
		
		int[][] nums = new int[3][4];
		
		nums[0][0]=100;
		nums[0][1]=500;
		nums[0][2]=1234;
		nums[0][3]=5434;
		
		
		nums[1][0]=54544;
		nums[1][1]=5002;
		nums[1][2]=134;
		nums[1][3]=543;
		
		
		nums[2][0]=1004;
		nums[2][1]=5001;
		nums[2][2]=134;
		nums[2][3]=434;
		
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[1]));
		
		int[][] scores = { {3,5,10},{6,4,2,10}};
		
		System.out.println(scores[0][2]);
		System.out.println(scores[0][1]);
		System.out.println(scores[1][0]);
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(Arrays.deepToString(scores));
		System.out.println(Arrays.toString(scores[1]));
		
		
		int [][] values = new int[4][];
		
		values[0]=new int[] {23,1,67,34};
		values[1]=new int[] {123,43,67,8,990,544,3,4,5,667,77,434,43,132};
		
		values[2]=new int[2];
		values[2][0]=55;
		values[2][1]=88;
		values[3]=new int[] {4,35,221,256,76};
		
		System.out.println(values[2][1]);
		
		System.out.println(Arrays.deepToString(values));
		
		int[][] nums1 = new int[2][3];
		nums[0][0]=1;
		nums[0][1]=2;
		nums[1][1]=3;
		
		
		int [][] intArray =new int[7][3];
		intArray[0][0] =0;
		intArray[0][1]=01;
		intArray[0][2]=02;
		intArray[5][0]=50;
		intArray[5][1]=51;
		intArray[5][2]=52;
		
		
		System.out.println(intArray[5][1]);
		
		int[][] data = new int[2][3];
		data[0][1]=5;
		data[1][2]=32;
		
		
		//LOOP 2D arrays
		
		String[][] pizzas={
				                      {"pepperoni","pinaple"},		
		                              { "cheese","tomato","veggi"},		                              
		                              {"rikotta","green peppers","mushroom"},
		                              {"peppes","shrimp","sosig","ham"},
		                              {"oliver","black olives"}
		
		                               };
		
		System.out.println(Arrays.toString(pizzas[2]));
		System.out.println("********************************************************");
		for(String[] pizza:pizzas) {
			System.out.print(pizza.length);
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("********************************************************");
		
		for(int i=0; i<pizzas.length;i++) {
			System.out.print(pizzas[i].length+" - ");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		int[][] students= {	{45,1,23}, 
				            {87,766,5,41}, 
				            {39,99,148}
				            
				            };
		
		for(int[] group:students) {
			for(int studentID:group) {
				System.out.print(studentID+" ");
				
			}
		
		}
		
		int [][] nums4 = {
				
				        {10,20},
				        {20,30,40,50},
				        {100,200,400},
				        {555,333,111,444,666,78}
								   
		                 };
		
		
		 
		for(int i=0; i<nums4.length; i++){
		for(int j=0; j<nums4[i].length;i++){
		
		System.out.println(nums4[i][j]+" ");
		}
		System.out.println();
		   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
