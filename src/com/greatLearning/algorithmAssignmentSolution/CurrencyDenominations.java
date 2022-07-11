package com.greatLearning.algorithmAssignmentSolution;

import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String argc[]) {
		System.out.println("Enter the size of Currency Denominations");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] notes = new int[n];
		int[] noteCounter = new int[n];
		int temp = 0;

		System.out.println("Enter the Currency Denominations value");
		for (int i = 0; i < n; i++) {
			notes[i] = sc.nextInt();
		}
		
		//Sort the notes in descending order
		for (int i = 0; i < notes.length; i++) {
			for (int j = i + 1; j < notes.length; j++) {
				if (notes[i] < notes[j]) {
					temp = notes[i];
					notes[i] = notes[j];
					notes[j] = temp;
				}
			}
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < n; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

}
