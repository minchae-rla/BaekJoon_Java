package day04;

import java.util.Scanner;

public class BaekJoon8393 {
	public static void main(String[] args) {
		//문제번호.8393
		//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}System.out.println(sum);
	}

}
