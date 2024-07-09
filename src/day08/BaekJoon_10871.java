package day08;

import java.util.Scanner;

public class BaekJoon_10871 {
	public static void main(String[] args) {
		//문제번호.10871
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int checkNum = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < checkNum) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
