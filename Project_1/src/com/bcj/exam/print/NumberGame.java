package com.bcj.exam.print;

class NumberGame {
	public void print(int x){
		for (int i=1 ; i<=x; i++){
			if (i%2==0 && i%5==0){
				System.out.println("Fiddle"+" "+"Faddle");
			}
			else if (i%5==0){
				System.out.println("Faddle");
			}
			else if (i%2==0){
				System.out.println("Fiddle");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
