package day07_Scanner_Operators;
import java.util.Scanner;
public class PreAndPost {
	public static void main(String[] args) {
	
		
		int num=0;
		int num2 = num++; //before increase num is adding to num2 =0
		
		System.out.println("num:"+num);
		System.out.println("num2:"+num2);
		
		int n=0;
		int n2 =++n;  //it is gonna adding 1 then assign to n2  = 1
		System.out.println("n:"+n);
		System.out.println("n2:"+n2);
		
		
		int i=10;
		++i;
		i++;
		System.out.println(i);
		
		
		int apples = 4; // 5
		int pears = apples++; // 4
		
		System.out.println(apples);
		System.out.println(pears);
		
		int kiwis = 6; //7
		int orange= ++kiwis;  //7
		
		System.out.println(kiwis);
		System.out.println(orange);
		
		
		int p1 = 10;   // p=p+1
		int sum=p1++ +5;  // p1+5 and assign to sum
		
		System.out.println("sum:"+sum);
		System.out.println("p1:"+p1);
		
		
		int battaries = 8;
		int totalBattaries = battaries++ + ++battaries;
		
		System.out.println(totalBattaries);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
