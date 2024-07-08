package day02;

import java.util.Scanner;

public class BaekJoon_11382 {
	public static void main(String[] args) {
		//문제번호. 11382
		//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		System.out.println(A + B + C);

		sc.close();
	}
}
