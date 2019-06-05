package this_is_for_practises;

public class Hotel {
	
	String name;
	int  star;
	int floor;
	boolean isYesPool;
	double price;
	boolean CheapOrExpensive;
	String owner;
	
	 public void stayAtHotel(String city , int mile) {
		 System.out.println("I know a hotel name is "+name+" and this hotel is in "+city+" It is about "+
	      mile+" mile away from us .");
		 
	 }
	 
	 public void outState(String country , int hour) {
		 System.out.println("Hello. I am coming from "+country+". I have reservation  at the "+star+" star "+name+" hotel.\n "+
	 " My room is in "+floor+" floor and i think they should have "+isYesPool+".\n Hotel Owner name is "+owner+
	 "I am coming with plane and my flying will be around "+hour+"hours.\n"+"Hotel "+name+" is not cheap "+CheapOrExpensive);
	 }
	
	    public void usingBoolean(String room) {
	    	if(room.equals("cheapOrExpensive")) {
	    		System.out.println("It is possible to stay there.");
	    	}else {
	    		System.out.println("I will go to find another hotel.");
	    	}
	    }
	
	

}
