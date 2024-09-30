package day21;

import java.util.Scanner;

public class BaekJoon_2720 {
	public static void main(String[] args) {
		//문제번호.2720
		//거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 
		//구하는 프로그램을 작성하시오. 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 
		//예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
		
		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            System.out.print(c / q + " ");
            c = c % q;
            System.out.print(c / d + " ");
            c = c % d;
            System.out.print(c / n + " ");
            c = c % n;
            System.out.println(c / p);
        }

        sc.close();
    }
}
