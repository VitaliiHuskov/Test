package strings;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("john" == new String("john"));
		System.out.println("john".equals("john"));
		System.out.println("john" == "john");
		System.out.println(new String("john") == new String("john"));
	}

}
