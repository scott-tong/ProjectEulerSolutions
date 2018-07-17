package projectEulerProblems;

public class Fibonacci {
	public static long sumOfEvenFibonacci(int numTerms) {
		long sum = 0;
		long val1 = 0;
		long val2 = 1;
		long swap = 0;
		
		for(int i = 0; i < numTerms; i++) {
			swap = val2;
			val2 += val1;
			val1 = swap;
			if((val2)%2 == 0)
				sum += val2;
		}
		System.out.println(val1 + " "+ val2);
		return sum;
	}
	
	public static long sumOfEvenUnder4Mil() {
		long sum = 0;
		long val1 = 0;
		long val2 = 1;
		long swap = 0;
		
		while(val2 <= 4000000) {
			swap = val2;
			val2 += val1;
			val1 = swap;
			if((val2)%2 == 0)
				sum += val2;
		}
		
		return sum;
	}
}
