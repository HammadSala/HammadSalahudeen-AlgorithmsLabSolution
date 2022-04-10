package com.greatlearning.lab.week2Agorithms;

import java.util.Scanner;

public class PayMoney {
	
	static //Declaring all the needed variables for the class
	Scanner sc = new Scanner(System.in);
	static int arr[];
	static int targetTrans;
	static int targetValue;
	static int size;
	static boolean flag = true;
	
	//fetching the user values and storing them
	static void getValues( int n, Scanner sc) {
		size = n;
		arr = new int[size];
		
		//Getting values of each transaction from user
		for (int i =0; i< n ; i++ ) {
			System.out.println(" Enter the value of transaction " + (i+1));
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		targetTrans = sc.nextInt();
		
	
		do {
			flag = calculateThreshold();
			
		}while(flag);
		
	}
	
	static boolean calculateThreshold() { 
		System.out.println("\nEnter the Value of target");
		targetValue = sc.nextInt();
		
		int tempSum = 0;
		int i = 0;
		boolean flag = false;
		
		//Since the requirement is to check for target on linear array traversal
		for (i =0; i < size ; i++ ) {

			//summing up linearly to see if the target value is coming
			tempSum += arr[i];
//			System.out.println(tempSum + " " + targetValue + " " + arr[i] );

			//comparing the target values with the target number of transactions to check the condition and stopping if met
			if ( tempSum > targetValue && i < targetTrans ) {
				System.out.println("Target " + targetValue+ " acheived in " + (i+1) + " transactions");
				flag = true;
				break;
			}
			
			
			
		}
		if ( !flag ) {  //for situation where the target is not achieved
			System.out.println("\nTarget " + targetValue+ " is NOT acheived in " + targetTrans + " transactions");
		}
		
		return flag;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;

		
		System.out.println("Enter the size of the transacation array");
		size = sc.nextInt();
		
		getValues(size, sc);

	}

}
