package day41;

import java.util.Scanner;

public class BaekJoon_2750 {
	public static void main(String[] args) {
		//문제번호.2750
		
		Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();

	    int[] arr = new int[n];

	    int temp;

	    for(int i=0;i<n;i++){
	      arr[i] = sc.nextInt();
	    }

	    for(int i=0;i<n;i++){
	      for(int j=i+1;j<n;j++){
	        if(arr[i]>arr[j]){
	          temp=arr[i];
	          arr[i] = arr[j];
	          arr[j] = temp;
	        }
	      }
	    }

	    for(int i=0;i<n;i++){
	      System.out.println(arr[i]);
	    }
	  }
	}