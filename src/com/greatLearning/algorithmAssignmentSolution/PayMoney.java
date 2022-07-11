package com.greatLearning.algorithmAssignmentSolution;

import java.util.Scanner;

public class PayMoney {
	public static void main(String args[]) {

		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the values of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int no_Target = sc.nextInt();
		int target = 0;
		int sum = 0;
		int flag = 0;

		for (int j = 0; j < no_Target; j++) {
			if (sum == 0) {
				System.out.println("Enter the value of target");
				target = sc.nextInt();
			}
			if (target == 0) {
				continue;
			}
			for (int i = 0; i < arr.length && sum < target; i++) {
				sum += arr[i];
				flag++;
			}
			if(target > sum) {
				System.out.println("Given target is not achieved");
			} else {
				System.out.println("Target achieved after " + flag + " transactions");
			}
			flag = 0;
			sum = 0;
		}
	}

}
