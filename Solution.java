import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt(), d = fs.nextInt();
			System.out.println(Math.max(a, b) + Math.max(c, d));
		}
		fs.close();
	}
}
