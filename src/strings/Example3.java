package strings;

public class Example3 {

	public static void main(String[] args) {
		final String s1 = "social";
		final String s2 = "media";
		String s3 = "socialmedia";
		String s4 = s1 + s2;
		String s5 = s1.concat(s2);

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));
	}

}
