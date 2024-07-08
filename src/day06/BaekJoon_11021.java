package day06;

import java.util.Scanner;

public class BaekJoon_11021 {
	public static void main(String[] args) {
		//문제번호.11021
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.\
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 1 ; i <= count ; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + (num1 + num2));
		} 
	}

}
