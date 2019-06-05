package this_is_for_practises;

import java.util.Arrays;
import java.util.Random;

public class Everything2 {
	public static void main(String[] args) {
		
		int needMoreThan = 200;
		if(getMax()>needMoreThan) {
			System.out.println("you win");
		}else {
			System.out.println("you lost");
		}
		
		
	}
	
	 public static int getMax() {
		 
		 int[] arr = new int[5];
		 Random rand = new Random();
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = rand.nextInt(250);
		 }
		 
		 int maxNum = Integer.MIN_VALUE;
		 for(int m:arr) {
			 if(m>maxNum) {
				 maxNum=m;
			 }
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 return maxNum;
		 
	 }

}
