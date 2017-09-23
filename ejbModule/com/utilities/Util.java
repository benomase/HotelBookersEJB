package com.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
public static java.sql.Date StringToDate(String date){//a mettre dans une classe util 
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	        Date parsed = format.parse(date);
	        java.sql.Date sql = new java.sql.Date(parsed.getTime());
	        return sql;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
        
	}
}