package me.michael.euler.problem017;

import java.util.Arrays;

public class Problem17 {

	public static String[] ones = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
			"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

	public static String[] tens = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

	public static String[] hundreds = {"one hundred","two hundred", "three hundred", "four hundred", "five hundred",
			"six hundred","seven hundred","eight hundred","nine hundred"};

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i<=1000; i++){
			String word = numToWord(i);
			word = word.replaceAll(" ", "");
			System.out.println(word);
			count+=word.length();
		}
		System.out.println(count);
	}

	public static String numToWord(int num){
		int[] digits = getDigits(num);
		if(num<20){
			return ones[num-1];
		}else if(num<100){
			int ten = digits[0];
			int one = digits[1];
			if(one==0){
				return tens[ten-1];
			}else{
				return tens[ten-1] + " " + ones[one-1];
			}
		}else if(num<=1000){
			if(num==1000){
				return "one thousand";
			}else if(digits.length==3 && digits[1]==0 && digits[2]==0){
				return hundreds[digits[0]-1];
			}else{
				//anything else
				int hund = digits[0];
				int ten = digits[1];
				int one = digits[2];
				if(Integer.parseInt(ten+""+one)<20){
					return hundreds[hund-1] + " and " + ones[Integer.parseInt(ten+""+one)-1];
				}

				if(one!=0){
					return hundreds[hund-1] + " and " + tens[ten-1] + " " + ones[one-1];
				}else{
					return hundreds[hund-1] + " and " + tens[ten-1];
				}
			}
		}
		return "";
	}

	public static int[] getDigits(int num){
		String number = String.valueOf(num);
		char[] numbers = number.toCharArray();
		int[] digits = new int[numbers.length];
		int iteration = 0;
		for(char c : numbers){
			int i = Integer.parseInt(String.valueOf(c));
			digits[iteration] = i;
			iteration++;
		}
		return digits;
	}

}
