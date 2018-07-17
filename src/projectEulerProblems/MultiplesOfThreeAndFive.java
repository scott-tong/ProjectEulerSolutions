package projectEulerProblems;

public class MultiplesOfThreeAndFive {
	/**
	 * Adds up multiples of three and five up to a point
	 * @param upTo
	 * @return
	 */
	public static int sumMultOfThreeAndFive(int upTo) {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			if(i%3 == 0)
				sum+=i;
			else if(i%5 == 0)
				sum+=i;
		}
		
		return sum;
	}
}
