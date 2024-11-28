package day28;

import java.util.Scanner;

public class BaekJoon_15894 {
	public static void main(String[] args) {
		//문제번호.15894
		//정사각형의 개수를 정해주었을때 도형의 둘레의 길이를 구하라
		//도형은 피라미드 형태로 쌓임
		
		Scanner sc = new Scanner(System.in);
		
		//도형이 하나 일때 길이 4
		//도형이 둘일 때 길이 8
		//도형이 셋일 때 길이 12
		//도형이 추가될때마다 길이가 4씩 증가 도형개수 * 4 만큼 늘어남
		
		//int로 작성시 오답 long으로 작성해야함
		//int n = sc.nextInt();
		
		//도형 개수 입력
		long n = sc.nextLong();
		
		System.out.println(n * 4);
	}

}
