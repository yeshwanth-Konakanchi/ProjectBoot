package com.crmindz.bcjmay2017.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class DemoService {
	
	/**
	 * @param data
	 * @return
	 * this method will will split the string and map that data to a hash map
	 */
	public static Map<String,String> mapTheData(String data){
		
		Map<String,String> map=new HashMap<String,String>();
		String delims = "[:,]+";
		String[] stringTokens = data.split(delims);
		
		for(int i=0; i<stringTokens.length; i++){
			if(i%2==0){
				map.put(stringTokens[i], stringTokens[i+1]);
			}
		}

		return map;
		
	}
	
	/**
	 * @param mapdata
	 * @param department
	 * @return
	 * This method will return the value when we query the data based on the department
	 */
	public static String retreiveData(Map<String,String> mapdata, String department){
		
		String value = mapdata.get(department);

		return value;
		
	}

}
