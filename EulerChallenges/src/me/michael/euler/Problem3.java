package me.michael.euler;

import java.util.ArrayList;

public class Problem3 {
	
	public static void main(String args[]){
		long num = 600851475143L;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i<num*2; i++){
			if(num%i==0){
				factors.add(i);
				num/=i;
			}
		}
		System.out.println(factors);
	}
	
}
