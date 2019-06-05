package Day_52;
import java.util.*;

public class FinalList {
	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("orange");
		COLORS.add("grey");
		COLORS.add("white");
		COLORS.add("blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("black");
		System.out.println(COLORS.toString());
		
//		COLORS = new ArrayList<>();
//		System.out.println(COLORS.toString());
//		COLORS.add("yellow");
		
		
	}

}
