package day08;

import java.util.Scanner;

public class BaekJoon_10807 {
	public static void main(String[] args) {
		//문제번호.10807
		//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		int count = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int checkNum = sc.nextInt();
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == checkNum) {
				count++;
			}
		}
		System.out.println(count);
	}

}
