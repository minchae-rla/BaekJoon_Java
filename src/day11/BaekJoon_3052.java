package day11;

import java.util.Scanner;

public class BaekJoon_3052 {
	public static void main(String[] args) {
		//문제번호.3052
		//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;

			boolean check = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				count++;
			}
		}
		System.out.println(count);
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] num1 = new int[10];
//		int[] num2 = new int[11];
//		int num3 = 0;
//		
//		for(int i = 0 ; i < 10 ; i++) {
//			num1[i] = sc.nextInt();
//			num2[i] = num1[i] % 42;
//		}
//		
//		for(int i = 0 ; i < 10 ; i++) {
//			if(num2[i] != num2[i+1]) {
//				num3++; 
//			}
//		}
//		System.out.println(num3);
	}

}
