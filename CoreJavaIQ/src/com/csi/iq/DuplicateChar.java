package com.csi.iq;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateChar {
	public static void main(String[] args) {

		System.out.println("\n Please enter input to find Duplicate Character:");
		Scanner sc = new Scanner(System.in);

		String inputStr = sc.next();

		String orignalString = inputStr.toLowerCase();

		char orgChar[] = orignalString.toCharArray();

		Set uniChar = new HashSet<>();

		Set dupChar = new HashSet<>();

		for (Character ch : orgChar) 
		{
			if (dupChar.add(ch)== false)
			{
				uniChar.add(ch);
			}
		}
		uniChar.forEach(System.out::println);
	}
}
