package test3;

import java.math.BigInteger;

public class SumOfDigit {

	// method to find the sum of digit
	public BigInteger findTheSumOfDigit(int number) {
		BigInteger sum = BigInteger.valueOf(0); // create object sum, start value 0
		BigInteger result = BigInteger.valueOf(1); // create object result, start value 1

		// cycle for finding factorial
		for (long i = 1; i <= number; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		// cycle to find the sum of the digits in the number
		while (!result.equals(BigInteger.ZERO)) {
			sum = sum.add(result.mod(BigInteger.valueOf(10)));
			result = result.divide(BigInteger.valueOf(10));
		}

		return sum; // return sum
	}

}