package Day_51;

public class SnowBoarding  extends Exercise{

	   public int perform(int minutes) {
		   super.perform(10);
		   System.out.println("Snowboarding for "+minutes+" minutes");
		   return minutes*7;
	   }
	   
	   
}
