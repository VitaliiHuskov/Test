package strings;

public class Example9 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello ");
		String s1 = "World!";

		// StringBuffer s2 = sb1.append(s1);
		// System.out.println(s2);

		// StringBuffer s2 = sb1.insert(0, s1);
		//// StringBuffer s3 = sb1.insert(3, s1);
		//// StringBuffer s4 = sb1.insert(7, s1);
		// System.out.println(s2);
		// System.out.println(s3);
		// System.out.println(s4);

		StringBuffer s2 = sb1.delete(0, 3);
		StringBuffer s3 = sb1.delete(0, 7);
		System.out.println(s2);
		System.out.println(s3);
	}

}
