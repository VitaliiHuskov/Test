package geteralIssues;

public class Example2 {
	
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		if (a || b && c)
			System.out.print("Hello ");
		if (a && !b && c)
			System.out.print("World");
	}
	
}
	