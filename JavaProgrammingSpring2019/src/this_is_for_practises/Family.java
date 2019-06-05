package this_is_for_practises;

public class Family {

	 String mother;
	 String father;
	 String sister1;
	 String sister2;
	 String sister3;
	 String brother;
	 
	 public void hazlFamily() {
		 System.out.println("Mother: "+mother+", Father: "+father+", First sister is "+sister1+" and Second sister is "+sister2);
	 }
	 
	 public void israfilovsFamily() {
		System.out.println("My fathers name is "+father+" and my mother name is \n"+mother+
		". I have 3 sisters. They are all younger than me . First my sister name is\n "+sister1+
		". She live in Rusia with her family. My second sister's name is \n"+sister2+
		". She live in Australia with her family .My last sister name is\n "+sister3+
		".She live in Azerbaijan with her family. I am "+brother+".i am only one brother in this family. ");
	 }
	 
	 public void newFamily(String name) {
		 System.out.println("Mother: "+mother+" Father: "+father+" "+name);
		 
	 }
}
