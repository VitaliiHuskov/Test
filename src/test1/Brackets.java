package test1;

public class Brackets {

	// method to check out number of correct expressions
	public int numberOfCorrectExpressions(int n) {

		int[] C = new int[n + 1]; // create array with length n + 1

		// check of number less than 1 return error message and 0 number in array
		if (n < 1) {
			System.err.println("The number is less than 1");
			return C[0] = 0;
		}

		C[0] = 1; // first object in array is 1

		// cycles to calculate C[i] i=1..n by Catalan function
		for (int i = 1; i <= n; i++) {
			C[i] = 0;
			for (int j = 0; j < i; j++)
				C[i] = C[i] + C[j] * C[i - 1 - j];
		}

		return C[n]; // return C[n] where n is number of correct expressions
	}

}