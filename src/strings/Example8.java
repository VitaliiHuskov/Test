package strings;

public class Example8 {

	public static void main(String[] args) {
		String s1 = "java ";
		String s2 = " is ";
		String s3 = " awesome .";
		String result = s1.trim() + s2 + s3.trim();
		System.out.println(result);
	}

}
