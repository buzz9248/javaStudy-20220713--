package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {

		/*
		 * 반복횟수 입력 : 10
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * i = 8
		 * i = 9
		 * i = 10
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);

		
	 	int i = 0;
		int j = 0;
		
		System.out.print("반복횟수 입력 : ");
		i = scanner.nextInt();
		
		while(j < i) {
			System.out.println("i = " + (j + 1));
			j++;
		}
		
		
		
		/*
		 * 반복횟수 입력 : 10
		 * 
		 * i = 10
		 * i = 9
		 * i = 8
		 * i = 7
		 * i = 6
		 * i = 5
		 * i = 4
		 * i = 3
		 * i = 2
		 * i = 1
		 * 
		 */
		
	
		
		int i2 = 0;
		int j2 = 0;
		
		System.out.print("반복횟수 입력 : ");
		i2 = scanner.nextInt();
		
		while(j2 < i2) {
			System.out.println("i2 = " + (i2 - j2));
			j2++;
		}
		
			
		
		
		
	}

}
