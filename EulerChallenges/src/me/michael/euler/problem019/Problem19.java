package me.michael.euler.problem019;

import java.util.Calendar;

public class Problem19 {

	public static void main(String[] args){
		Calendar start = Calendar.getInstance();
		start.set(Calendar.MONTH, Calendar.JANUARY);
		start.set(Calendar.DAY_OF_YEAR, 1);
		start.set(Calendar.YEAR, 1901);
		
		int count = 0;
		while(true){
			if(start.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				if(start.get(Calendar.DAY_OF_MONTH)==1){
					count++;
				}
			}
			if(start.get(Calendar.YEAR)==2000 && start.get(Calendar.DAY_OF_MONTH)==31 && start.get(Calendar.MONTH)==Calendar.DECEMBER){
				System.out.println("NUM: " + count);
				break;
			}
			start.add(Calendar.DAY_OF_YEAR, 1);
		}
		
		System.out.println(start.getTime());
	}
	
}
