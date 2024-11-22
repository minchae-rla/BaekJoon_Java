package day25;

import java.util.Scanner;

public class BaekJoon_2581 {
	public static void main(String[] args) {
		//문제번호.2581
		//두수 입력 M이상 N이하의 자연수 중 소수의합과 최솟값구하기
		
		Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[N];

        int count, tot=0, sosuCount=0;
        for(int i=M; i<=N; i++){
            count =0;
            int j=1;

            // 소수 하나를 입력받으면 입력받은수 / (1부터 입력받은 수까지) 계산하여
            while(j<=i){
                if(i % j == 0){
                    count++;
                }
                j++;
            }
            // 카운트가 자신과 1일 때의 2개인 경우에만 소수 출력
            if(count == 2) {
                tot+=i;
                arr[sosuCount] = i;
                sosuCount++;
            }
        }
        if(tot == 0 || arr[0] == 0){
            System.out.println(-1);
        }else {
            System.out.println(tot);
            System.out.println(arr[0]);
        }
        sc.close();
    }
}