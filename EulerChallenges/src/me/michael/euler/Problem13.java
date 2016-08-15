package me.michael.euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;

public class Problem13 {

	public static void main(String[] args)throws Exception{
		File f = new File("Problem13.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		BigInteger integer = BigInteger.ZERO;
		String in;
		while((in=reader.readLine()) !=null){
			BigInteger curr = new BigInteger(in);
			integer = integer.add(curr);
		}

		String toWord = integer.toString();
		for(int i = 0; i<10; i++){
			System.out.print(toWord.toCharArray()[i]);
		}
	}

}
