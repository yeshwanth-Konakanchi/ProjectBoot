package algorithms;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String []args){
		int sum=0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=1; i<num ; i++){
			if (num%i==0){
				sum+=i;
			}
		}
		if (sum==num){
			System.out.println("num is a perfect number");
		}
		else{
			System.out.println("num is not a perfect number");
		}
		s.close();
	}
}