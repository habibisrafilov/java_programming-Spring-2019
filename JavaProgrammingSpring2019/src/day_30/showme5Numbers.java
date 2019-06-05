package day_30;

import java.util.Random;

public class showme5Numbers {
public static void main(String[] args) {
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	
}


   public static void showMe5Numbers() {
	   Random r =new Random();
	   for(int i=1; i<=3; i++) {
		   System.out.print(r.nextInt(1001)+" ");
	   }
	   
	   System.out.println();
   }








}
