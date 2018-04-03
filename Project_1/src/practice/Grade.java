package practice;

import java.util.Scanner;

public class Grade {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String grade = s.next();
		
		switch(grade){
		case "A":
			System.out.println("80-100");
			break;
		case "B":
			System.out.println("73-79");
			break;
		case "C":
			System.out.println("65-72");
			break;
		case "D":
			System.out.println("55-64");
			break;
		case "E":
			System.out.println("<55");
			break;
		default :
			System.out.println("Grade does not exist");
		}
		s.close();
	}

}
