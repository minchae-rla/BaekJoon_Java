package day05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//문제번호.10950
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
 
		for (int i = 0; i < length; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i] = num1 + num2;
		}
		sc.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
	}
 
}