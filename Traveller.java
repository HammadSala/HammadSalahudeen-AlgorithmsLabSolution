package com.greatlearning.lab.week2Agorithms;

import java.util.Scanner;
//import java.util.Arrays;

public class Traveller {
	int denomSize;
	int arr[], result[];
	int amount;
	Scanner sc = new Scanner(System.in);

	private void getValues() {
		System.out.println("Enter the size of currency denominations");
		denomSize = sc.nextInt();
		arr = new int[denomSize];
		result = new int[denomSize];

		for (int i = 0; i < denomSize; i++) {
			System.out.println(" Enter the currency denominations value " + (i + 1));
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		amount = sc.nextInt();

	}

	private void resultPrint() {
		System.out.println("\nYour payment approach in order to give min no of notes will be");
		System.out.println("Denom\t:\tNumber of Notes");
		for (int i = denomSize - 1; i >= 0; i--) {
			if (result[i] != 0) {
				System.out.println(arr[i] + "\t:\t" + result[i]);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traveller obj = new Traveller();

		obj.getValues();
		obj.arr = TravellerUtility.payMinimumnotes(obj.arr, 0, (obj.denomSize - 1));
//		System.out.println("Sorted Denominations are " + Arrays.toString(obj.arr));
		obj.result = TravellerUtility.denomFinder(obj.arr, obj.amount);

//		System.out.println(Arrays.toString(obj.result));
		obj.resultPrint();

	}

}
