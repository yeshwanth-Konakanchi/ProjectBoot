package com.crmindz.bcjMay2017.CodingQue2;

public class Person implements Human, Animal{

	@Override
	public boolean canWalk() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println(person.canWalk());
		
		Human human = new Person();
		
		human.canWalk();
		
	}

}
