/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str_to_reverse = (args[0]);
		int str_length = str_to_reverse.length();
		String reversed_str = "";
		for( int i = str_length - 1; 0 <= i; i-- ) {
			reversed_str = reversed_str + str_to_reverse.charAt(i);
		}
		System.out.println(reversed_str);
		System.out.println("The middle character is " + str_to_reverse.charAt(str_length / 2));
	}
}
