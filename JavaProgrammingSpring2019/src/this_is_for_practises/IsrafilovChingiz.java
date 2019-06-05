package this_is_for_practises;

public class IsrafilovChingiz {
	public static void main(String[] args) {
		
		Son son1 = new Son("Chingiz",65,1.74,110.20,"Teacher");
		System.out.println(son1.getAge());
		System.out.println(son1.getName());
		System.out.println(son1.getHeight());
		System.out.println(son1.getWeight());
		System.out.println(son1.getJobTitle());
		
		
		Son.workPlace("Haci Zeynalabdin Tagiyev");
		Father.howLongWorkingAtSchool(1997);
		
		
	}

}
