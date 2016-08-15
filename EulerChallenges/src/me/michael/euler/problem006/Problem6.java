package me.michael.euler.problem006;

public class Problem6 {
	
	public static void main(String args[]){
		long squareOfSums = squareOfSum(100);
		long sumOfSquares = sumOfSquares(100);
		
		long diff = squareOfSums-sumOfSquares;
		System.out.println(diff);
	}
	
	public static long sumOfSquares(int numbers){
		int sum = 0;
		for(int i = 1; i<=numbers; i++){
			sum+=Math.pow(i, 2);
		}
		return sum;
	}
	
	public static long squareOfSum(int numbers){
		int sum = 0;
		for(int i = 1; i<=numbers; i++){
			sum+=i;
		}
		sum=(int) Math.pow(sum, 2);
		return sum;
	}
	
}
