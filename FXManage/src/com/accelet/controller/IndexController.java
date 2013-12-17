package com.accelet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.accelet.baseclass.BaseMultiActionController;

public class IndexController extends BaseMultiActionController {
	private String indexView;
	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView(getIndexView());
	}
	public String getIndexView() {
		return indexView;
	}
	public void setIndexView(String indexView) {
		this.indexView = indexView;
	}

}
