package day25;

import java.util.Scanner;

public class BaekJoon_9506 {
	public static void main(String[] args) {
		//문제번호. 9506
		//입력한 숫자가 완전수 인지 판별(완전수 : 자신을 제외한 약수의 합이 본인과 동일한 수)
		Scanner sc = new Scanner(System.in);
		
		//숫자를 입력 후 약수를 int sum에 저장한후 index마지막번호(자기자신)을 제외한 수가 num과 같은지 계산
		while(true) {
			int n = sc.nextInt();
			if(n == -1)
				break;
			
			int[] arr = new int[n]; // 약수 담을 배열
			int sum = 0;			// 약수들의 합
			int index = 0;			// 약수 담을 배열의 인덱스
			for(int i = 1; i < n; i++) {
				if(n%i == 0) {		// 약수일 때(나눴을때 나머지가 0이면 약수)
					arr[index++] = i;	// 약수 저장
					sum += i;			// 약수 합
				}
			}
			
			if(sum != n) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}
			
			System.out.print(n + " = ");
			for(int i=0; i<index; i++) {
				if(i == index-1)
					System.out.print(arr[i]);
				else
					System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}