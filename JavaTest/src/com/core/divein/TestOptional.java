package com.core.divein;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] ="PRESENT";
		Optional<String> checkPresent = Optional.ofNullable(str[5]);
		Optional<String> checkAbsent = Optional.ofNullable(str[6]);
		
		
		System.out.print("ifPresent PRESENT-----------------------\n");
		checkPresent.ifPresent((s)->System.out.println("Present")) ;
		
		System.out.print("isPresent  PRESENT----------------------\n");
		if (checkPresent.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("Not Present");
		
		System.out.print("\nisPresent  ----------------------\n");
		if (checkAbsent.isPresent()) {
			String word = str[6].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("String is not present");

		 Optional<String> orElse5 = Optional.of(str[5]);
		 Optional<String> orElse6 = Optional.empty();
		 System.out.print("orElseGet  PRESENT-----------------------\n");
		 System.out.println(orElse5.orElseGet(() -> "Default Value")); 
		 System.out.print("orElseGet  -----------------------\n");
		 System.out.println(orElse6.orElseGet(() -> "Default Value")); 
			
	}
}
