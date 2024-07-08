package day04;

import java.util.Scanner;

public class BaekJoon_2739 {
	public static void main(String[] args) {
		//문제번호.2739
		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} 
	}

}
