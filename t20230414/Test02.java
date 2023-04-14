package t20230414;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		do { // 읽는 값
			System.out.print("세 자리의 정숫값: ");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999); // 3자리 정수값
		
		System.out.println("입력한 값은 " + x + "입니다.");
	}

}
