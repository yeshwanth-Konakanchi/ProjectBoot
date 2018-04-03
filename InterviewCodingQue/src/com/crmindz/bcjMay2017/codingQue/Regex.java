package com.crmindz.bcjMay2017.codingQue;


import java.util.regex.Pattern;

public class Regex {
	
	

	static void testForValidVin() {
		   String vinNumber = "JH1HS36S0KW051833";
		   
		   System.out.println(Pattern.matches("[A-Z0-9]{17}", vinNumber));
		 
	        
	        if(vinNumber.length()==17){
	            if("0000000000000TEST".equals(vinNumber) && "TRAINING123456789".equals(vinNumber) && "NOTAVIN0987654321".equals(vinNumber)){
	                System.out.println("INVALID");
	            }
	            
	            else if(Pattern.matches("^(.*[a-zA-Z0-9\\S&&[^@#$&]]){17}$", vinNumber)){
	                System.out.println("VALID");
	            }
	            
	            else{
	                System.out.println("INVALID");
	            }
	        }
	        
	        else{
	        	System.out.println("INVALID");
	        }

	}
	
	public static void main(String[] args) {
		
		Regex.testForValidVin();
	}
}
