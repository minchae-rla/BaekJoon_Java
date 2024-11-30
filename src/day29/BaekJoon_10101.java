package day29;

import java.util.Scanner;

public class BaekJoon_10101 {
	public static void main (String[] args) {
		//문제번호.10101
		//삼각형 종류 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//세각 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a + b + c != 180) {
			System.out.println("Error");
		} else if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if(a == b || b == c || a == c) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
	}

}
