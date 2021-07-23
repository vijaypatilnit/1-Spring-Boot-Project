package com.nt.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1,"Santosh");
		m.put(2,"Anubhav");
		m.put(3, "Vaibhav");
		m.put(4,"macc");
		m.put(1, "Yougesh");
//		System.out.println(m);
//		Transversing map
		Set set=m.entrySet();
		System.out.println(set);
//	
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
//			Converting Map into getKey and getvalue separtaly
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(""+entry.getValue());
		}
	}

}
