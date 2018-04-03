package collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("Avinash", 121, "ECE")); 
		set.add(new Student("Avinash", 121, "ECE"));
		
		System.out.println(set);
		
		Iterator<Student> it = set.iterator();
		 
		while (it.hasNext())
		{
		    Student student = (Student) it.next();
		 
		    System.out.println(student);
		}
		
	}

}
