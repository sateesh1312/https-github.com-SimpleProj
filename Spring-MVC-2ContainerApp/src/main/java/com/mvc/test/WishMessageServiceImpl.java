package com.mvc.test;

import java.util.Calendar;

public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateMessage() {
		
		Calendar calendar=Calendar.getInstance();
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		String msg="";
		if(hour<=12) {
			msg="GOOD MORNING";
			}
		else if(hour<=16) {
			msg="GOOD AFTERNOON";
			}
		else if(hour<=20) {
			msg="GOOD EVENING";
			}
		else {
			msg="GOOD NIGHT";
		}
		System.out.println("msg::"+msg);
		return msg;
		
	}

}
