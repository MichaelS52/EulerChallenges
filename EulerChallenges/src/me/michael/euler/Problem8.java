package me.michael.euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem8 {

	public static void main(String args[])throws Exception{
		File f = new File("Problem8.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String all="";

		String in;
		while((in=reader.readLine()) !=null){
			all+=in;
		}
		char[] digits = all.toCharArray();
		int count = 0;
		int adj = 13;
		BigInteger largest = BigInteger.ZERO;
		for(char c : digits){
			if(count<1000-(adj-1)){
				BigInteger product = BigInteger.ONE;
				for(int i = 0; i<adj; i++){
					BigInteger mult = BigInteger.valueOf(Long.parseLong(String.valueOf(digits[count+i])));
					product = product.multiply(mult);
				}
				if(product.compareTo(largest)==1){
					largest = product;
					System.out.println(count + " "+ product);
				}
			}
			count++;
		}
		System.out.println("ANSWER: " + largest.toString());
	}
}
