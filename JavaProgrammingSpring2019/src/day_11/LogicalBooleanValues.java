package day_11;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		
		boolean b1 = 50>10 && 10>100;
		System.out.println(b1);
		
		boolean b2 = 'a'=='a' && 123>120;
		System.out.println(b2);
		
		boolean b3 = true && 10>=10 && 1000 <=900;
		System.out.println(b3);
	
		  boolean b4 = false && false && 10==10;
		  System.out.println(b4);
		
		   boolean b5 = false || true && 10==10;
		   System.out.println(b5);
		
		    boolean b6 = false && false || 10==10;
		    System.out.println(b6);
		
		
		   boolean b7 = true && true || 10!=10;
		   System.out.println(b7);
		
		   boolean b8 = false && (true || 10==10);
		   System.out.println(b8);
		
		
		boolean topicDone = true;
		boolean isMoreThan3Pm = true;
		boolean everyThingIsClear = true;
		
		boolean letsgoForABreak = topicDone  && isMoreThan3Pm && everyThingIsClear;
		System.out.println(letsgoForABreak );
		
		boolean b9 = !(true || false) && true;
		System.out.println(b9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
