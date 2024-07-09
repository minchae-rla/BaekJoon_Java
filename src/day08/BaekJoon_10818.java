package day08;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10818 {
	public static void main(String[] args) {
		//문제번호.10818
		//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[num-1]);
	}

}
