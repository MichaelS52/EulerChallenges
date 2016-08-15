package me.michael.euler.problem007;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

	public static void main(String args[]){
		int primes = 0;
		for(int i=2; i<=Integer.MAX_VALUE; i++){
			if(isPrime(i)) {primes++;}
			if(primes==10001){
				System.out.println(i);
				break;
			}
		}
	}

	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}


}
