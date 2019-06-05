package Day_53;

import Day_54.InheritanceReview;

public class TestProtected extends InheritanceReview {
	public static void main(String[] args) {
		
		TestProtected tp = new TestProtected();
		InheritanceReview ir = new InheritanceReview();
		
		ir.method();
		tp.proMethod();
		
		
	}

}
