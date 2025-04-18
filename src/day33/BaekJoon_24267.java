package day33;

import java.util.Scanner;

public class BaekJoon_24267 {
	public static void main(String[] args) {
		//문제번호.24267
		//알고리즘 수행횟수 출력
		
		//빅오표기법
		//O(1) – 상수 시간 : 문제를 해결하는데 오직 한 단계만 처리함.
		//O(log n)** – 로그 시간 : 문제를 해결하는데 필요한 단계들이 연산마다 특정 요인에 의해 줄어듬.
		//O(n) – 직선적 시간 : 문제를 해결하기 위한 단계의 수와 입력값 n이 1:1 관계를 가짐.
		//O(n log n) : 문제를 해결하기 위한 단계의 수가 N*(log2N) 번만큼의 수행시간을 가진다. (선형로그형)
		//O(n^2) – 2차 시간 : 문제를 해결하기 위한 단계의 수는 입력값 n의 제곱.
		//O(C^n) – 지수 시간 : 문제를 해결하기 위한 단계의 수는 주어진 상수값 C 의 n 제곱.
		
		//예제코드 분석
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n - 2
//		        for j <- i + 1 to n - 1
//		            for k <- j + 1 to n
//		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
//		    return sum;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		
		System.out.println(n*(n-1)*(n-2)/6);
		System.out.println(3);
	}

}
