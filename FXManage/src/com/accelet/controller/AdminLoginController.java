package com.accelet.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.accelet.baseclass.BaseMultiActionController;
import com.accelet.entity.FxAdminEntity;

public class AdminLoginController extends BaseMultiActionController{

	private String successView;
	private String loginView;
	
	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username==null || password==null)
			return new ModelAndView(getLoginView());
		if(username.length()==0 || password.length()==0){
			return new ModelAndView(getLoginView()).addObject("err","�û����������벻��Ϊ�գ�");
		}
		FxAdminEntity enty = getFxAdminDAO().queryByAdmin(username.trim());
		if(enty==null || enty.getSn()==0){
			return new ModelAndView(getLoginView()).addObject("err","���˺Ų����ڣ�");
		}else if(!enty.getPwd().equals(password.trim())){
			return new ModelAndView(getLoginView()).addObject("err","����������������룡");
		}else if(enty.getValidFlag()==0){
			return new ModelAndView(getLoginView()).addObject("err","�˺ű���ͣ��");
		}
		request.getSession().setAttribute("admin_sn", enty.getSn());
		request.getSession().setAttribute("admin_name", username);
		return new ModelAndView(getSuccessView());
	}

	public String getSuccessView() {
		return successView;
	}

	public String getLoginView() {
		return loginView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public void setLoginView(String loginView) {
		this.loginView = loginView;
	}
	
}
