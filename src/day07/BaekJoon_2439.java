package day07;

import java.util.Scanner;

public class BaekJoon_2439 {
	public static void main(String[] args) {
		//문제번호.2439
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
 
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
