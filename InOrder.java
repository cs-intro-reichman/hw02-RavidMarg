/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int min_random_number = 0;
		int random_number = (int)(Math.random() * 10);
		while ( min_random_number <= random_number) {
			System.out.print(random_number + " ");
			min_random_number = random_number;
			random_number = (int)(Math.random() * 10);
		}
		System.out.print("\n");
	}
}
