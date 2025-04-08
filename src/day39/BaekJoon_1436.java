package day39;

import java.util.Scanner;

public class BaekJoon_1436 {
	public static void main(String[] arsg) {
		//문제번호.1436
		
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int count = 0;
        int num = 666;

        while (count < N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            num += 1;
        }

        System.out.println(num - 1);
    }
}
