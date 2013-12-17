package com.accelet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.accelet.baseclass.BaseMultiActionController;

public class MenuController extends BaseMultiActionController {
	private String menuView;
	
	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String admin_name=request.getSession().getAttribute("admin_name").toString();
		return new ModelAndView(getMenuView()).addObject("admin_name",admin_name);
	}
	
	public String getMenuView() {
		return menuView;
	}
	public void setMenuView(String menuView) {
		this.menuView = menuView;
	}
}
