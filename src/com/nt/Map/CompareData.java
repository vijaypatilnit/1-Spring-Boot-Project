package com.nt.Map;

import java.util.Comparator;
import java.util.LinkedHashSet;

import java.util.TreeSet;

public class CompareData {
public static void main(String[] args) {
TreeSet l = new TreeSet (new myComparator());
	l.add("H");
	l.add("B");
	l.add("D");
	l.add("J");
	l.add("A");
	System.out.println(l);
}
}
class myComparator implements Comparator{
	//myComparator m=new myComparator();
	public int compare(Object obj1,Object obj2 ){
		 String s1=obj1.toString();
		 String s2=obj2.toString();
		 return s1.compareTo(s2);
		 
		}
	}

