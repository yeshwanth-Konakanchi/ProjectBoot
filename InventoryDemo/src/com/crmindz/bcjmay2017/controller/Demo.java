package com.crmindz.bcjmay2017.controller;

import java.util.Map;
import java.util.Scanner;

import com.crmindz.bcjmay2017.service.DemoService;


/**
 * @author Yeshwanth Konakanchi
 * This class will take the string data from the user and the retrieve data after some manipulations on the string
 */
public class Demo {
	
	/**
	 * @param args
	 * main method to retrieve and print the data
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the data String");
		String data = scan.nextLine();
		
		Map<String,String> mapData = DemoService.mapTheData(data);
		
		displayTheMappedData(mapData);
		
		System.out.println("would you like to retrieve the data for a given department?");
		System.out.println("If so, press 'YES'");
		String yes = scan.nextLine();
		
		if("YES".equals(yes)){
			System.out.println("Enter the Department: ");
			String department = scan.nextLine();
			String value = DemoService.retreiveData(mapData,department);
			System.out.println(value);
			
		}
		
		else{
			System.out.println("Thank you, Have a nice day!");
		}
		
		
	}
	
	/**
	 * @param mapData
	 * this method will display the data retrieved based on the queried department
	 */
	public static void displayTheMappedData(Map<String,String> mapData){
		
		for(Map.Entry<String,String> entry:mapData.entrySet()){
			 String key=entry.getKey();  
		      String value=entry.getValue(); 
		      System.out.println(key+"->"+value);
			
		}
		
	}

}
