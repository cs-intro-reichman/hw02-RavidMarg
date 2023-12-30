/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int sum_of_children = 0;
		int num_of_families_with_2_children = 0;
		int num_of_families_with_3_children = 0;
		int num_of_families_with_4_or_more_children = 0;
		for( int i = 1 ; i <= T; i++ ) {
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
			sum_of_children = sum_of_children + number_of_children;
			switch(number_of_children){
				case 2:
					num_of_families_with_2_children++;
					break;
				case 3:
					num_of_families_with_3_children++;
					break;
				default:
					num_of_families_with_4_or_more_children++;
					break;
			}
		}
		String most_common_number_of_children = "";
		if (num_of_families_with_2_children > num_of_families_with_3_children) {
			if (num_of_families_with_2_children > num_of_families_with_4_or_more_children) {
				most_common_number_of_children = "2";
			}
			else{
				most_common_number_of_children = "4 or more";
			}
		}
		else if (num_of_families_with_3_children > num_of_families_with_4_or_more_children ){
			most_common_number_of_children = "3";
		}
		else{
			most_common_number_of_children = "4 or more";
		}
		System.out.println("Average: " + ((double)sum_of_children / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num_of_families_with_2_children);
		System.out.println("Number of families with 3 children: " + num_of_families_with_3_children);
		System.out.println("Number of families with 4 or more children: " + num_of_families_with_4_or_more_children);
		System.out.println("The most common number of children is " + most_common_number_of_children + ".");

	}
}
