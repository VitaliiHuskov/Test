package syntax;

public class Example2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		System.out.println(i += (j < i) ? (2) : (3)); // 1
	}

}
