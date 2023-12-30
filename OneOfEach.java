
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int number_of_children = 0;
		while (boy == false || girl == false){
			number_of_children++;
			if (Math.random() < 0.5){
				boy = true;
			}
			else {
				girl = true;
			}
		}
		System.out.println("You made it... and you now have " + number_of_children + " children.");
	}
}
