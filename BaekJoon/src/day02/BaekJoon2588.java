package day02;

import java.util.Scanner;

public class BaekJoon2588 {
	public static void main(String[] args) {
		// 문제번호.2588
		// 세자릿수 곱셈의 순서별로 결과 출력
		//	예시 472 * 385
		//2360
		//3776
		//1416
		//181720
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 % 100) / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);

	}

}
