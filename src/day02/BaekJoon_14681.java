package day02;

import java.util.Scanner;

public class BaekJoon_14681 {
	public static void main(String[] args) {
		//문제번호.14681
		//입력한 숫자의 사분면위치 구하기
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > 0 && B >0) {
			System.out.println(1);
		} else if(A < 0 && B > 0) {
			System.out.println(2);
		} else if(A < 0 && B < 0) {
			System.out.println(3);
		} else if(A > 0 && B < 0) {
			System.out.println(4);
		} else {
			System.out.println("원점");
		}
		
		
	}

}
