/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]); // the given number to find the divisors of
		int sum_of_divisors = 0;
		String divisors = "0";
		if ( x != 0) {
			sum_of_divisors++;
			divisors = "1";
			for (int i = 2; i <= (x - 1); i++) {
				if (x % i == 0) {
					sum_of_divisors = sum_of_divisors + i;
					divisors = divisors + " + " + i;
				}
			}
		}
		if ( x == sum_of_divisors ){
			System.out.println( x + " is a perfect number since " + x + " = " + divisors) ;
		}
		else {
			System.out.println( x + " is not a perfect number") ;
		}
	}
}
