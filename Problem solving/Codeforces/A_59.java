import java.util.Scanner;

public class A_59 {
	public static void main(String[] args) {
		String value;

		Scanner input = new Scanner(System.in);

		value = input.nextLine();

		int lower = 0, upper = 0;

		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				lower++;
			}
			else {
				upper++;
			}
		}
		if(lower < upper) {
			System.out.println(value.toUpperCase());
		}
		else {
			System.out.println(value.toLowerCase());
		}
	}
}
