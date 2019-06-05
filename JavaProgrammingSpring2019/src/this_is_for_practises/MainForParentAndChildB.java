package this_is_for_practises;

public class MainForParentAndChildB {
	public static void main(String[] args) {
		
	ChildB cb1 = new ChildB();
	ChildB cb2 = new ChildB("rent");
	ChildB cb3 = new ChildB("rent a apartment",1605);
	
	ParentA.count = 40;
	ChildB.count = 35;
	ParentA.count = 50;
	
	
	System.out.println(cb1.getNumber());
	System.out.println(cb1.getWord());
	System.out.println(cb2.getNumber());
	System.out.println(cb2.getWord());
	System.out.println(cb3.getNumber());
	System.out.println(cb3.getWord());
	System.out.println(ParentA.count);
	System.out.println(ChildB.count);
	System.out.println(ParentA.count);
	
	ChildB.buildAMap("Pittsburgh");
	ParentA.buildAMap("PA");
	ChildB.tellMeYourCountry("Azerbaijan");
	cb2.tellMeYourCountry("Turkey");
	
	
		
		
		
		
		
		
		
	}

}
