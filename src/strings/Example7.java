package strings;

public class Example7 {

	public static void main(String[] args) {
		if (new String("Default").trim() == new String("Default"))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
