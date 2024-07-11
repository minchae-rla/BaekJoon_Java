package day10;

import java.util.Scanner;

public class BeakJoon_10813 {
	public static void main(String[] args) {
		//문제번호.10813
		//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
		//도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
		//공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];

		for(int x = 0 ; x < arr.length ; x++) {
			arr[x] = x+1;
		}
		
		// 공 바꾸는 횟수
		for(int x = 0 ; x < M ; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int num = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = num;		
		}

		for(int x = 0 ; x < arr.length ; x++) {
			System.out.print(arr[x] + " ");
		}
	}
}
