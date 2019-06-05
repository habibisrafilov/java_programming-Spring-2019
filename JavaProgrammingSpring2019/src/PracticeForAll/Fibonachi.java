package PracticeForAll;
import java.util.*;

public class Fibonachi {

	public static void main(String[] args) {
		

		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
		    
		    int num1 = 0 ; 
		    int num2 = 1;
		    
		    if(num==0){
		      System.out.println(0);
		    }else if(num==1){
		      System.out.println(1);
		      
		    }else{
		    	int fib = 0;
		      for(int i=2; i<=num;i++){
		    	  
		        fib=num1+num2;
		        num1 = num2;
		        num2 = fib;
		         
		      }
		       System.out.println(fib);
		       
		    }
		    
		    
		  }
		
	}

