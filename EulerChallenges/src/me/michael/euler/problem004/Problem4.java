package me.michael.euler.problem004;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		for(int i = 100; i<=1000; i++){
			for(int j = 100; j<=1000; j++){
				int product = i*j;
				if(isPalindrome(product)) palindromes.add(product);
			}
		}
		int largest = 0;
		for(int pal : palindromes){
			if(pal>largest){
				largest=pal;
			}
		}
		System.out.println(largest);
		System.out.println(palindromes);
	}

	public static boolean isPalindrome(long l){
		String word = String.valueOf(l);
		char[] letters = word.toCharArray();
		String forward = "";
		String backward = "";
		for(int i = 0; i<letters.length; i++){
			forward+=letters[i];
			backward+=letters[(letters.length-i)-1];
		}
		if(forward.equals(backward)){
			return true;
		}
		return false;
	}

}
