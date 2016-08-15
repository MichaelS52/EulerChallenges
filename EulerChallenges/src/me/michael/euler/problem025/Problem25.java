package me.michael.euler.problem025;

import java.math.BigInteger;

/**
 * 
 * @author Michael S.
 *
 */

public class Problem25 {

	//1000-digit Fibonacci number
	public static void main(String[] args){
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;
		
		for(int i = 0; i<Integer.MAX_VALUE; i++){
			if(String.valueOf(f1).length()==1000){
				System.out.println("Answer: " + i+1);
				System.out.println(f1);
				break;
			}
			BigInteger newNum = f1.add(f2);
			f1=f2;
			f2=newNum;
		}
	}
	
}
