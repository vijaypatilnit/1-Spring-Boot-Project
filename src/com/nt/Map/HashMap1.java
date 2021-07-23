package com.nt.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main (String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(155, "Sandy");
		map.put(156, "Monty");
		map.put(1868, "Kunal");
		map.put(656, "Rohidas");
		System.out.println(map);
		//LinkedHashMap<Integer, String> set=map.entrySet();
//		System.out.println(set);
		for(Map.Entry m:map.entrySet())
		{
			//System.out.println(m.getKey()+"..."+m.getValue());
		}
		map.replace(155, "Sandy", "karan");
		System.out.println(map);
		map.remove(156, "Monty");
		System.out.println(map);
	}

}
