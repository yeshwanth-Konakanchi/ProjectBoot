package com.crmindz.bcjMay2017.codingQue;



public class FizzBuzz {
	
	
	private static void fizzBuzz() {
		// TODO Auto-generated method stub
		final String emptyValue = "";
        for (int numberCount = 1;  numberCount <= 15;  numberCount++) {
            String outputValue = emptyValue;
            if ( numberCount % 3 == 0) outputValue += "Fizz";
            if ( numberCount % 5 == 0) outputValue += "Buzz";
            if (outputValue == emptyValue) outputValue +=  numberCount;
            System.out.println(outputValue);
        }
	}
		
	public static void main(String[] args){
		
		fizzBuzz();
	}
	
	
	

}
