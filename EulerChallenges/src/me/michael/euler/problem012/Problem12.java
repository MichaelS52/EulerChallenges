package me.michael.euler.problem012;

import java.util.ArrayList;
import java.util.List;

public class Problem12 {

	public static void main(String[] args){
		int i = 0;
		while(true){
			int num = getNthTriangleNumber(i);
			int divisors = getDivisors(num);
			System.out.println(divisors);
			if(divisors>500){
				System.out.print("Number: " + num);
				break;
			}
			i++;
		}
	}
	
	public static int getNthTriangleNumber(int n){
		int sum = 0;
		for(int i = 1; i<=n; i++){
			sum+=i;
		}
		return sum;
	}
	
	public static int getDivisors(int n){
		int count = 0;
		for(int i = 1; i*i<=n; i++){
			if(n%i==0){
				count+=2;
			}
		}
		return count;
	}
}
