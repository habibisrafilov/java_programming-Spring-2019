package Day_20;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		// using for loop : 1-100
		// print all even numbers in same line
		
		// print all odd numbers in same line 
		
		// sumOfOdds , sumOfEvens - calculate them and print out after the loop
		
		int sumOfEvens = 0;
		for(int i=0; i<=100; i++) {
			//System.out.println(i);
			if(i%2==0) {
				System.out.print(i+" ");
				sumOfEvens+=i;
			}
			
			
		}
		System.out.println();
		System.out.println("SumOfEvens: "+sumOfEvens);
		
		
		     int SumOfOdds = 0;
		   for(int k=0; k<100; k++) {
			   if(k%2==1) {
				   System.out.print(k+" ");
				   SumOfOdds+=k;
			   }
		   }
//		
		     System.out.println();
		    System.out.println("sumOfOdds: "+SumOfOdds);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
