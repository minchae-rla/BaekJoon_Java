package day17;

import java.util.Scanner;

public class BaekJoon_2444 {
	public static void main(String[] args) {
		// 문제번호.2444
		// 마름모 모양으로 별찍기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}