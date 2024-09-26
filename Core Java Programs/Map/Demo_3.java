package com.Map;

import java.util.HashMap;
	import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	public class Demo_3 {

		public static void main(String[] args) {
			
		Map<String,Double> empDetails=new HashMap();
			
		empDetails.put("EMp801",56400.00 );
		empDetails.put("EMp802",5400.00 );
		empDetails.put("EMp803",52400.00 );
		empDetails.put("EMp804",45200.00 );
		
		Set<Entry<String,Double>>entries=empDetails.entrySet();
		
		for(Entry<String,Double>en:entries)
		{
			System.out.println(en.getKey()+ " "+en.getValue());
		}
}
	}
