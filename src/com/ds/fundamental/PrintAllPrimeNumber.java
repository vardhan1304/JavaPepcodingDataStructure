package com.ds.fundamental;

import java.util.Scanner;

public class PrintAllPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int n = low; n<high;n++) {
			int count = 0;
			
			for(int div=2;div*div<=n;div++) {
				if(n%div==0) {
					count++;
					break;
				}
			}
			//try to divide n and increase count
			if(count==0) {
				System.out.println(n);
			}
			
		}
		sc.close();
	}

}
