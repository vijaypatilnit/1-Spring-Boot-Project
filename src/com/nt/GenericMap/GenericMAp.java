package com.nt.GenericMap;

import java.util.HashMap;
import java.util.Map;

public class GenericMAp {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1001,"AAAA");
		map.put(2002, "BBBBB");
		map.put(3003,"CCCC");
		map.put(4004, "DDDD");
//		System.out.println(map);
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}

	}

}
