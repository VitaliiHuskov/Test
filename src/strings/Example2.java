package strings;

public class Example2 {

	public static void main(String[] args) {
		String s1 = "Jonh ";
		String s2 = "Dylan";
		String s3 = s1.concat(s2);
		String s4 = s1 + s2;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
