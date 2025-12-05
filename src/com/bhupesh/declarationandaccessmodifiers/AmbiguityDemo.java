package com.bhupesh.declarationandaccessmodifiers;

import java.sql.Date;
//import java.util.*;


public class AmbiguityDemo {

	public static void main(String[] args) {
		
		long d = System.currentTimeMillis();
		
		Date date = new Date(d);
		
		System.out.println(date);

	}

}
//class Date{}