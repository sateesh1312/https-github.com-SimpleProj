package com.mvc.test;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageController extends AbstractController{
	private WishMessageService service;
	 public WishMessageService getService() {
		return service;
	}

	public void setService(WishMessageService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println(service);
		 String msg=service.generateMessage();
		 System.out.println(msg);
		ModelAndView mv=new ModelAndView();
		mv.addObject("wsmsg", msg);
		mv.setViewName("wshmsg");
		return mv;
	}

}
