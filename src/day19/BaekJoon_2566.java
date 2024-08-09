package day19;

import java.util.Scanner;

public class BaekJoon_2566 {
	public static void main(String[] args) {
		//문제번호.2566
		//9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int row = 0;	
		int column = 0;
		
		int[][] num = new int[9][9];
		
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(max < num[i][j]) {
					max = num[i][j];
					row = i + 1;
					column = j + 1;
				} else if(max == 0) {
					row = 1;
					column = 1;
				}
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(row + " " + column);

	}
}
