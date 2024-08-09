package day19;

import java.util.Scanner;

public class BaekJoon_2738 {
	public static void main(String[] args) {
		//문제번호.2738
		//N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				System.out.print(A[i][j] + B[i][j] + " ");
			}
		}
		
	}

}
