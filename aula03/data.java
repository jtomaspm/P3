package aula03;

import java.time.LocalDate;

public class data {
	
	private int day;
	private int month;
	private int year;
	
	
	public data(int day, int month, int year) {
		if(checkDate(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}else {
			System.out.print("invalid date \n");
		}	
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	private boolean checkDate(int day, int month, int year) {
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			if(day < 32 && day > 0)
				return true;
		}
		if(month==4 || month==6 || month==9 || month==11) {
			if(day < 31 && day > 0)
				return true;
		}
		if(month==2) {
			if(year%4==0) {
				if(day > 0 && day < 30) {
					return true;
				}
			}else {
				if(day > 0 && day < 29) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String getDate() {
		String date = "";
		date += this.year + "/";
		date += this.month + "/";
		date += this.day;
		return date;
	}
	
	public static int[] getCurrentDate() {
		String[] sp = LocalDate.now().toString().split("-");
		int[] r = new int[sp.length];
		for (int i = 0; i < sp.length; i++) {
			r[i] = Integer.parseInt(sp[i]);
		}
		return r;
	}
	
}
