package com.ksg.java8code;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeOfPerson {

	public static void main(String[] args) {

		LocalDate birthDay = LocalDate.of(1999, 01, 12);
		
		LocalDate Today = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, Today));
	}

}
