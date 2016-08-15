package me.michael.euler;

public class Problem5 {

	public static void main(String[] args){
		for(int num=1; num<=Integer.MAX_VALUE; num++){
			if(divisibleByAllTo20(num)){
				System.out.println(num);
				return;
			}
		}
	}
	
	public static boolean divisibleByAllTo20(int num){
		for(int i = 1; i<=20; i++){
			if(num%i!=0){
				return false;
			}
		}
		return true;
	}
	
}
