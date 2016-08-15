package me.michael.euler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args){
		BigInteger i = BigInteger.valueOf(2).pow(1000);
		String s = String.valueOf(i);
		char[] digits = s.toCharArray();
		System.out.println(s);
		int sum = 0;
		for(char d : digits){
			sum+=Integer.parseInt(String.valueOf(d));
		}
		System.out.println(sum);
	}
	
}
