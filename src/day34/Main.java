package day34;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//문제번호.24313
	    Scanner sc = new Scanner(System.in);

	    int a1 = sc.nextInt();
	    int a0 = sc.nextInt();
	    int c = sc.nextInt();
	    int n0 = sc.nextInt();

	    if((a1*n0+a0)<= c*n0 && a1 <= c){
	        System.out.println(1);
	    }else{
	        System.out.println(0);
	    }
	    sc.close();
	    }
	}