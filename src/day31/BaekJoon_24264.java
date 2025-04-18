package day31;

import java.util.Scanner;

public class BaekJoon_24264 {
	public static void main(String[] args) {
		//문제번호.24264
		//알고리즘 수행횟수 출력
		
		//빅오표기법
		//O(1) – 상수 시간 : 문제를 해결하는데 오직 한 단계만 처리함.
		//O(log n)** – 로그 시간 : 문제를 해결하는데 필요한 단계들이 연산마다 특정 요인에 의해 줄어듬.
		//O(n) – 직선적 시간 : 문제를 해결하기 위한 단계의 수와 입력값 n이 1:1 관계를 가짐.
		//O(n log n) : 문제를 해결하기 위한 단계의 수가 N*(log2N) 번만큼의 수행시간을 가진다. (선형로그형)
		//O(n^2) – 2차 시간 : 문제를 해결하기 위한 단계의 수는 입력값 n의 제곱.
		//O(C^n) – 지수 시간 : 문제를 해결하기 위한 단계의 수는 주어진 상수값 C 의 n 제곱.
		
		//예제코드 분석
//		MenOfPassion(A[], n) {							A[]배열변수와 n(직접입력한 변수)가 사용된다
//		    sum <- 0;									합계를 저장한 sum변수 선언, 및 0으로 초기화
//		    for i <- 1 to n								입력한 수 n만큼 반복
//		        for j <- 1 to n							이중 for문 입력한 수 n만큼 반복
//		            sum <- sum + A[i] × A[j]; # 코드1		A[]배열의 i번째와 j번째의 값을 곱한 만큼 sum변수에 저장
//		    return sum;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		sc.close();
		
		System.out.println(n * n);
		System.out.println(2);
	}

}
