package com.nt.Map;

import java.util.HashMap;
import java.util.Map;

class Book{
	int id;
	String name,Auther,publisher;
	int quantity;
	
	

	public Book(int id, String name, String auther, String publisher, int quantity) {
		
		this.id = id;
		this.name = name;
		this.Auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", Auther=" + Auther + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
}
public class MapExample2 {

	public static void main(String[] args) {
		Map<Integer,Book> map=new HashMap<Integer,Book>();
		Book b1=new Book(12,"Agnipunkh","APJ","mac",23);
		Book b2=new Book(16,"Sahjh","sadny","sameer",25);
		Book b3=new Book(15,"gyjgh","kjguh","satish",21);
         map.put(1, b1);
         map.put(2,b2);
         map.put(3,b3);
         System.out.println(map);
         for(Map.Entry<Integer, Book> entry:map.entrySet())
         {
        	 int h=entry.getKey();
        	 Book b=entry.getValue();
        	 System.out.println(h+"....Datails");
        	 System.out.println(b);
         }
	}

}
