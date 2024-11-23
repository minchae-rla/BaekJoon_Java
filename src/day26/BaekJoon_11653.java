package day26;

import java.util.Scanner;

public class BaekJoon_11653 {
	public static void main(String[] args) {
		//문제번호.11653
		//수를 입력하였을 때 소인수분해하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		//소인수분해는 2로 시작하기 때문에 2로 나누고 나머지가 0이면 반복
		//0이아닐경우 1씩 증가하여 나누기
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
	}

}
