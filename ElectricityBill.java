package com.logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter electricity bill");
		double currentbillcost=0;
		String  yn="";
	do {

		System.out.println("Enter the customer type : ");
		String customer =sc.next();
		
		System.out.println("Enter the no:of units need :");
		int unit =sc.nextInt();
		
		
			switch(customer) {
			
			
			case "domestic"->{
				System.out.println("domestic - 5/-");
				double domesticcost=5;
				currentbillcost=unit*domesticcost;
			
			}
			case "commercial"->{
				System.out.println("commercial - 8/-");
				double commercialcost=8;
				currentbillcost=unit*commercialcost;
				
			}
			case "industrial"->{
				System.out.println("industrial - 10/-");
				double industrialcost=10;
				currentbillcost=unit*industrialcost;
				
			}
			default->System.out.println("invalid customer type");
			
			}
			
			
			
			System.out.println("********Electricity Bill*********");
			
			
			System.out.println("customer type :"+customer);
			System.out.println("Consumed Units: " + unit);
	        System.out.println("Total Electricity Bill: Rs." + currentbillcost);

	        System.out.println("Do you want to continue with categories click Y for Yes N for N..?");
			yn = sc.next();
			
	}while(yn.equalsIgnoreCase("y"));
			
			
	
	}

}
