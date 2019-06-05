package this_is_for_practises;

public class Person_v2 {
	private String name;
	private byte age;
	private float weight;
	
	Person_v2(){
		name = "unassigned";
		age = (byte)0;
		weight = 20f;
	}
	
	Person_v2(String name, int age, double weight){
		setPerson(age, weight, name);
	}
	
	public void setPerson(int age,double weight,String name) {
		this.setAge(age);
		setWeight(weight);
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public byte getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
	}
	
	private void setName(String newName) {
		if (newName == null) { 
			System.out.println("Error: Name is null");
			return;
		}
		boolean onlyLetters = true;
		for (int i = 0; i < newName.length(); i++) {
			if (!Character.isLetter(newName.charAt(i))) {
				onlyLetters = false;
				break;
			}
		}
		if(newName.isBlank() || !onlyLetters) {
			System.out.println("Error: invalid name");
		} else {
			name = newName;
		}
	}
	
	void setAge(int newAge) {
		if (newAge<0 || newAge > 127) {
			System.out.println("Error: invalid age");
		} else {
			age = (byte) newAge;
		}
	}
	
	private void setWeight(double newWeight) {
		if (newWeight > 0) weight = (float) newWeight;
		else System.out.println("Error: invalid weight");
	}
}
