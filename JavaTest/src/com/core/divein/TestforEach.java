package com.core.divein;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestforEach {
	
	public static void main(String[] args) {
		System.out.println("======================================= Testing Map =============================================");
		testMap();
		System.out.println("======================================= Testing List =============================================");
		testList();
		System.out.println("======================================= Testing Stream =============================================");
		testStream();
	}
	

	public static void testMap()
	{
	      Map<Integer, String> objMap = new HashMap<Integer, String>();
	      objMap.put(1, "Square");
	      objMap.put(2, "Triangle"); 
	      objMap.put(3, "Circle");  
	      objMap.put(4, "Hexagon");   
	      objMap.put(5, "Pentagon");   
	      
	      //display  key and value pair
	      objMap.forEach((key,value)->System.out.println(key+" -> "+value));
	      // display the value of a particular  
	      objMap.forEach((key,value)->{ 
	         if(key == 2){ 
	            System.out.println("Key 2 is: "+value); 
	         }  
	      }); 
  }
	
	public static void testList()
	{
		 List<String> colours = new ArrayList<String>();
		 colours.add("Blue");
		 colours.add("Orange");
		 colours.add("Pink");
		 colours.add("Green"); 
	     //lambda expression in forEach Method 
		 colours.forEach(str->System.out.println(str));
	}
	
	public static void testStream() {
	      List<String> colours = new ArrayList<String>();
	      colours.add("Alice in Wonderland");
	      colours.add("Snow White");
	      colours.add("Sleeping Beauty");
	      colours.add("Rapunzel");
	      colours.add("Heidi");
	      colours.stream() //create stream 
	     .filter(f->f.startsWith("S")) //filtering names that starts with M 
	     .forEach(System.out::println); //displaying the stream using forEach
	   }
}
