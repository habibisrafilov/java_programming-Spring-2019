package Day_50;

public class AppsFactory {

	 public static void main(String[] args) {
		
		 
		 IphoneApp iapp = new IphoneApp();
		 IphoneApp iapp2 = new IphoneApp("Uber");
		 
		 AndroidApp andrApp = new AndroidApp();
		 AndroidApp andrApp2 = new AndroidApp("Lyft");
		 
		 System.out.println(iapp.getName());
		 System.out.println(iapp2.getName());
		 
		 
		 System.out.println(andrApp.getName());
		 System.out.println(andrApp2.getName());
		 
		 App.count = 33;
		 System.out.println(IphoneApp.count);
		 AndroidApp.count = 100;
		 
		 System.out.println("App.count: "+App.count);
		 System.out.println("IphoneApp.count: "+IphoneApp.count);
		 System.out.println("AndroidApp.count: "+AndroidApp.count);
		 
		 App.build("Swift");
		 IphoneApp.build("Objective C");
		 AndroidApp.build("Java");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
