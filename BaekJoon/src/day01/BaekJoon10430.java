package day01;

import java.util.Scanner;

public class BaekJoon10430 {
	public static void main(String[] args) {
		//문제번호.10430
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) ×
		// (B%C))%C를 출력한다.
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, C = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}

}
