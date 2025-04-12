package day40;

import java.util.Scanner;

public class BaekJoon_2839 {
	public static void main(String[] arsg) {
		//문제번호.2839
		
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int count = 0;
        while (N > 0) {
            if (N % 5 == 0) { // N이 5로 나눠질수 있을 경우 5로 나눠버린 후 출력
                count += N / 5; // 5로 나눈 몫을 count 에 더함
                System.out.println(count);
                return;
            }
            if (N < 3) {
                System.out.println("-1"); // N이 3보다 적을 경우에는 -1
                return;
            }
            N-=3; // N이 5로 안나눠질 경우에는 3kg 짜리 하나를 만듬
            count++;
        }
        System.out.println(count);
	}

}
