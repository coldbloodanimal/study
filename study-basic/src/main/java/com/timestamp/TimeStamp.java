package com.timestamp;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
    public static void main(String[] args) throws Exception {  
    	Timestamp time = new Timestamp(System.currentTimeMillis());
    	System.out.println("time"+time);
    	Date date=new Date();
    	System.out.println(date.getTime());
    	long aaa=Long.parseLong("1488902400000");
    	Timestamp ts = new Timestamp(aaa);
    	System.out.println("datetoTimestamp"+ts);
    	String atime="2017-03-15T00:00:00";
    	//Timestamp stot=Timestamp.valueOf(atime);

//    	DateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//    	Date aa = format.parse("1488902400000");
 // Sat Jan 02 00:00:00 GMT 2010
    	//System.out.println("stot"+stot);
    }  
}
