package practice;

import java.util.HashMap;

public class StringTest {
	
	String S = new String();
	
	public static void main(String[] args) {
		
//		StringTest str = new StringTest();
//		StringTest str1 = new StringTest();
//		System.out.println(str);
//		System.out.println(str1);
//		str.S = "yo";
//		System.out.println(str.S.hashCode());
//		str.S = "yoyo";
//		System.out.println(str.S.hashCode());
//		System.out.println(str.S);
//		String s = "fix";
//		System.out.println(s.hashCode());
//		 s = "goal";
//		System.out.println(s.hashCode());
//		
//		String S1 = new String("goa");
//		System.out.println(S1.hashCode());
//		S1 = "gogo";
//		System.out.println(S1.hashCode());
//		String c = "yesh";
//		System.out.println(c.hashCode());
//		String d = "yesh";
//		System.out.println(d.hashCode());
		
		StringBuffer S3 = new StringBuffer("goa");
		System.out.println(S3.toString().hashCode());
		String S4 = new String("goa");
		System.out.println(S4.hashCode());
		String S5 = new String("gogoagone");
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put(S3.toString(), "place");
		map.put(S5, "movie");
		
		System.out.println(map.get(S4));
		
	}

}
