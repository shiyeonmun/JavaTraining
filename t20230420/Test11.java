package t20230420;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();  // 요소 수 입력
		int[] a = new int[n];     // 배열 생성
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = " );
			a[i] = stdIn.nextInt();
		}
		System.out.print("a = {");
		if (n >= 2)
			for (int i = 0; i < n -1; i++)  // 앞에서부터 n-1개 요소 표시
				System.out.print(a[i] + ", ");
		if (n >= 1)
			System.out.print(a[n - 1]);   // 마지막 요소 표시
		System.out.print("}");

	}

}
