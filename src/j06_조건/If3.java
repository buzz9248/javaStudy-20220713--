package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		String result = null;

		Scanner scanner = new Scanner(System.in);

		x = scanner.nextInt();
		y = scanner.nextInt();

		if (x > 0 && y > 0) {
			result = "1";
		}else if (x < 0 && y < 0) {
			result = "3";
		}else if (x < 0 && y > 0) {
			result = "2";
		}else if (x > 0 && y < 0) {
			result = "4";
		}

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);

	}

}
