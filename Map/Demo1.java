package com.Map;

import java.util.HashMap;
import java.util.Map;


//Example of creating generics or without specificy 
//type
public class Demo1 {

	public static void main(String[] args) {
		
		/*here we are creating Hashmap object by invoking
		 * default constructor of HashMap() class 
		 * 
		 *  if we create the object of map by initializing the objet Hashmap
		 *  by invoking default constrcutor then it alloccate 16 buckets 16 buckets and default 
		 *  load factor is 0.75
		 *  
		 *  ii)HashMap(int capacity)
		 *  --->the above constructor can inintalize the capacity by passing given inetger value
		 *  
		 *  iii)HashMap(Map,m)
		 *  --->The above constructor can convert any valid type of Map object into HashMap
		 *  
		 *  iv)HashMap(int capacity ,float loadfactor)
		 * --->Here we can pass out own capacity and load factor
		 * 
		 */
		Map map=new HashMap(50);
		map.put(10, "ABC");
		map.put("key1", 100);
		map.put(true, 3456.00);
		System.out.println(map);
		
		

	}

}
