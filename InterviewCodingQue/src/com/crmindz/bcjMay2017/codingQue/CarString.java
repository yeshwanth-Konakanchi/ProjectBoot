package com.crmindz.bcjMay2017.codingQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarString {
	
	public static void doThings(){
		String inputCarNames = "Ford,Audi,Tesla,Tesla,Honda,GM,GM,Lincoln,Mazda";
        String[] carNames = inputCarNames.split(",");
        
        for(int i=0; i<carNames.length; i++){
            System.out.println(carNames[i]);
        }
        
        System.out.println();
        
        Arrays.sort(carNames);
        
        for(int i=0; i<carNames.length; i++){
            
            System.out.println(carNames[i]);
        }
        
         System.out.println();
        
        ArrayList<String> sortedCarsList=new ArrayList<String>(Arrays.asList(carNames));
        
        Set<String> noDuplicatesCarList=new LinkedHashSet<String>(sortedCarsList);
        
        for(String output:noDuplicatesCarList){
            System.out.println(output);
        }
        
         System.out.println();
        
        for(String output:noDuplicatesCarList){
            
            System.out.println(output.length());
        }

		
	}
	
	public static void main(String[] args) {
		doThings();
	}

}
