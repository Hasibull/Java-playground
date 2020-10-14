import java.util.Scanner;

public class A_1304 {
	public static void main(String[] args) {
		int tc;

		Scanner input = new Scanner(System.in);

		tc = input.nextInt();

		while(true) {
			int x,y,a,b;

			x = input.nextInt();
			y = input.nextInt();
			a = input.nextInt();
			b = input.nextInt();

			int diff = y - x;

			if(diff % (a + b) == 0) {
				System.out.println(diff / (a + b));
			}
			else {
				System.out.println("-1");
			}
			--tc;

			if(tc <= 0){
				break;
			}
		}
	}
}
