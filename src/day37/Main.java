package day37;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//문제번호.19532
		Scanner sc = new Scanner(System.in);
		
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int AE_BD = A * E - B * D;

        int CE_BF = C * E - B * F;
        int AF_CD = A * F - C * D;

        int X = CE_BF / AE_BD;
        int Y = AF_CD / AE_BD;

        System.out.println(X + " " + Y);
	}

}
