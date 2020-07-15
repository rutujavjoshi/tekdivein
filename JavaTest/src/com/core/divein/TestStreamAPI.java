package com.core.divein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPI {

	public static void main(String[] args) {
		List<Integer> participantAge = new ArrayList<Integer>();
		participantAge.add(35);
		participantAge.add(27);
		participantAge.add(66);
		participantAge.add(23);
			
		//Filter
		long count = participantAge.stream().filter(num->num<25).count();
		System.out.println("-------Filter-----------------------");
		System.out.println("Age Less than 25:"+count);
		
		//Concatenation two Streams
		List<Integer> participantAge2 = new ArrayList<Integer>(Arrays.asList(22,44,32,25,27));
		Stream<Integer> opstream = Stream.concat(participantAge.stream(), participantAge2.stream());
		System.out.println("-------concatenation-----------------------");
		opstream.forEach(num->System.out.print(num+","));

	}

}
