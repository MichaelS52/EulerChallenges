package me.michael.euler.problem002;

public class Problem2 {

	public static void main(String args[]){
		int prev1 = 1;
		int prev2 = 2;
		
		int sum = 0;
		for(int i = 0; i <= Integer.MAX_VALUE; i++){
			
			int thisNum = prev1+prev2;
			if(thisNum>4000000){
				break;
			}
			
			if(thisNum%2==0){
				sum+=thisNum;
			}
			
			prev1 = prev2;
			prev2 = thisNum;
			
			
		}
		
		System.out.println(sum);
	}
	
}
