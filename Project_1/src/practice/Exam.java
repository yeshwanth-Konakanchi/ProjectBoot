package practice;

import java.util.Scanner;

public class Exam {
	public boolean hasPassed(int marks){
		if (marks>=65 && marks <=100){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		Exam ex= new Exam();
		boolean x= ex.hasPassed (marks);
		if (x==true){
			System.out.println("Passed Successfully");
		}
		else{
			System.out.println("Failed");
		}
		s.close();
	}

}
