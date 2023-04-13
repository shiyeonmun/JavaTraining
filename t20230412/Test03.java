package t20230412;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int n = stdIn.nextInt();
		int abs;
		
		if (n >= 0)
			abs = n; // n >=0이 true일 때 실행한다.
		else
			abs = -n; // n >=0이 false일 때 실행한다.
		System.out.println("절댓값은 " + abs + "입니다.");
	}
}
