package com.bhupesh.declarationandaccessmodifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifySubPackageAccess {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Bhupesh@12");
		Matcher matcher = pattern.matcher("Yuvraj@12");
		boolean matcherfound = matcher.find();
		
		System.out.println(matcherfound);
		System.out.println(pattern);
		System.out.println(matcher);

	}

}
