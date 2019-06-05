package day_29;

import java.util.Arrays;

public class Class_Countries {
	public static void main(String[] args) {
		

		String [][] ctr={
		{"USA","Washington DC"},
		{"Canada", 	"Ottawa"},
		{"Mexico","Mexico city"},
		{"Brasil","Brasilia"},
		{"Peru", "Lima"},
		{"Argentina", "Boanes Aeros"},
		{"Bolivia","La Paz"},
		{"Macedonia","Scopia"},
		{"Kazakhstann","Nursultan"} 
	                   };
		
		System.out.println(ctr[0][0]+"|"+ctr[0][1]);
		System.out.println(ctr[2][0]+"|"+ctr[2][1]);
		System.out.println(ctr[8][0]+"|"+ctr[8][1]);
		System.out.println(ctr.length);
		//System.out.println(Arrays.deepToString(ctr));
		
		for(int i=0; i<ctr.length; i++) {
			System.out.print(ctr[i][0]+" | ");
			
			//System.out.print(ctr[i][1]+" | ");
		}
		
		
		for(int i=0; i<ctr.length; i++) {
			System.out.print(ctr[i][1]+" | ");
		}
		
		System.out.println();
		
		for(String[] country: ctr) {
			System.out.print(country[0]+" ");
		}
		System.out.println();
		for(String [] names :ctr) {
			System.out.print(names[1]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<ctr.length; i++) {
			System.out.print(ctr[i][1]+" ");
		}
		
		System.out.println();
		
		
		String[] cities= new String[ctr.length];
		
		System.out.println(Arrays.toString(cities));
		
		for(int i=0; i<ctr.length; i++) {
			cities[i]=ctr[i][1];
		}
		
		System.out.println(Arrays.toString(cities));
		
		System.out.println();
		
		System.out.println(ctr[6][1]+" ");
		
		System.out.println();
		
		for(int i=0; i<ctr.length; i++) {
			for(int j=0; j<ctr.length; j++) {			
			
			if(ctr[j].equals("Bolivia")) {
			System.out.println(ctr[j][1]);	
	}
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
