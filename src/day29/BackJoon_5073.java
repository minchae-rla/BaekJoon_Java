package day29;

import java.util.Scanner;

public class BackJoon_5073 {
	public static void main (String[] args) {
		//문제번호.5073
		//삼각형 종류 구하기2
		//마지막에는 0 0 0 을 입력하여 종료(계산하지않음)
		
		Scanner sc = new Scanner(System.in);
		
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && b == c) {
                if (a == 0)
                    break;
                System.out.println("Equilateral");
            } else if (a + b <= c || b + c <= a || c + a <= b) {
                System.out.println("Invalid");
            } else if (a != b && b != c && c != a) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}
