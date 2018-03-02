package UtilFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datefunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		System.out.println(date);// Note displays system date and time 
		//O/p : Tue Feb 27 18:37:02 IST 2018
		
		// separating date formulas
	  SimpleDateFormat day=new SimpleDateFormat();
	  System.out.println(day.format(date));
		

	}

}
