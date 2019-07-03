package exceptions;

public class Exception3 {
	
	int count;
	
	void A() throws Exception {
		try {
			count++;

			try {
				count++;

				try {
					count++;
					throw new Exception();

				} catch (Exception ex) {
					count++;
					throw new Exception();
				}
			} catch (Exception ex) {
				count++;
			}
		} catch (Exception ex) {
			count++;
		}
	}
	
	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		Exception3 exception3 = new Exception3();
		exception3.A();
		exception3.display();
	}
	
	
	
}
