package projectEulerProblems;

/*I had to look up the solution for this problem. I did not know/remember an algorithm
to calculate largest prime factor */

public class LargestPrimeFactor {
	// function to find largest prime factor
	static long maxPrimeFactors( long n)
	{
	    // Initialize the maximum prime
	    // factor variable with the 
	    // lowest one
	    long maxPrime = -1;
	 
	    // Print the number of 2s
	    // that divide n
	    while (n % 2 == 0) {
	        maxPrime = 2;
	         
	        // equivalent to n /= 2
	        n >>= 1; 
	    }
	 
	    // n must be odd at this point,
	    // thus skip the even numbers 
	    // and iterate only for odd
	    // integers
	    for (int i = 3; i <= Math.sqrt(n); i += 2) {
	        while (n % i == 0) {
	            maxPrime = i;
	            n = n / i;
	        }
	    }
	 
	    // This condition is to handle 
	    // the case when n is a prime 
	    // number greater than 2
	    if (n > 2)
	        maxPrime = n;
	 
	    return maxPrime;
	    

	 // This code is contributed by Gitanjali
	}
}
