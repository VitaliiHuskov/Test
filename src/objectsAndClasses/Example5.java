package objectsAndClasses;

public class Example5 {

	int outer_x = 100;

	void test() {
		for (int i = 0; i < 5; i++) {
			class Inner {
				void display() {
					System.out.print("outer_x = " + outer_x + "; ");
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}

	public static void main(String args[]) {
		Example5 outer = new Example5();
		outer.test();
	}

}
