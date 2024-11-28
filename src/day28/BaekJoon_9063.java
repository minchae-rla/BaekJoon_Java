package day28;

import java.util.Scanner;

public class BaekJoon_9063 {
	public static void main(String[] args) {
		//문제번호.9063
		//좌표 4개가 정해졌을때 가장 작은 크기의 사각형의 넓이를 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//좌표 개수 입력(여기선 4로 고정)
        int n = sc.nextInt();
        
        //x좌표 입력 (n , 0) x좌표를 먼저 모두 입력
        int[] x = new int[n];
        //y좌표 입력
        int[] y = new int[n];
        
        //전체구역설정
        int xmin = 10000;
        int xmax = -10000;
        int ymin = 10000;
        int ymax = -10000;
        int area = 0;
        
        //반복문을 통해 값 구하기
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            if (xmin > x[i]) {
                xmin = x[i];
            }
            if (ymin > y[i]) {
                ymin = y[i];
            }
            if (xmax < x[i]) {
                xmax = x[i];
            }
            if (ymax < y[i]) {
                ymax = y[i];
            }
        }
        area = (xmax - xmin) * (ymax - ymin);
        System.out.println(area);
        sc.close();

    }
}
