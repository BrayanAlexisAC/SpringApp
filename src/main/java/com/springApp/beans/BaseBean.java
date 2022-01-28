package com.springApp.beans;

import org.springframework.web.servlet.ModelAndView;

public class BaseBean {
	private ModelAndView modelAndView = null;

	public BaseBean() {
		modelAndView = new ModelAndView();
	}
	
	public ModelAndView getModelAndView() {
		return modelAndView;
	}
	
	public void setView(String view) {
		modelAndView.setViewName(view);
	}
	
	public void setParameter(String name, Object value) {
		modelAndView.addObject(name, value);
	}
}