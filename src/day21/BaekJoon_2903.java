package day21;

import java.util.Scanner;

public class BaekJoon_2903 {
	public static void main(String[] args) {
		//문제번호. 2903
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 2;
        for (int i = 1; i <= n; i++) {
            res = (res-1) + res;
        }
        System.out.println(res*res);
    }
}