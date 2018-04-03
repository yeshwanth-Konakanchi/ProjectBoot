package com.crmindz.bcjMay2017.codingQue;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinctEx {
 
    public static void main(String a[]) {
    	
    	
    	List<Integer> list =  Arrays.asList(1,2,3,4,4,6);
    	
    	 list =  list.stream().distinct().collect(Collectors.toList());
      
		for(Integer i : list){
    		
    		System.out.println(i);
    	}
    }
}