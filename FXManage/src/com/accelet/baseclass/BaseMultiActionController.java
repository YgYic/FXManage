package com.accelet.baseclass;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.multiaction.ParameterMethodNameResolver;

import com.accelet.dao.IFxAccountDAO;
import com.accelet.dao.IFxAdminDAO;


public abstract class BaseMultiActionController extends MultiActionController {
	private static ParameterMethodNameResolver methodNameResolver = new ParameterMethodNameResolver();
	private static ApplicationContext ctx = null;
	private static IFxAccountDAO 	fxAccountDAO;
	private static IFxAdminDAO 	fxAdminDAO;

	public BaseMultiActionController(){
		if (ctx == null) {
			String filePath = this.getClass().getClassLoader().getResource("/").getPath();
			ctx = new FileSystemXmlApplicationContext( filePath.substring(0, filePath.length()-8) + "db-config.xml");
		}
		if (fxAccountDAO == null) {
			fxAccountDAO = (IFxAccountDAO)getCtx().getBean("fxAccountDAO");
		}
		if (fxAdminDAO == null) {
			fxAdminDAO = (IFxAdminDAO)getCtx().getBean("fxAdminDAO");
		}
		methodNameResolver.setParamName("action");
		methodNameResolver.setDefaultMethodName("execute");
		setMethodNameResolver(methodNameResolver);
	}
	
	abstract public ModelAndView execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
	
	/**
	 * 提示信息，跳转页面
	 *@author huang.die 
	 */
	public static ModelAndView getSimpleModelAndView(String msg,String url)
	{
		return new ModelAndView("simpleMessageView")
				   .addObject("msg", msg)
				   .addObject("url", url);
	}
	/**
	 * 提示信息，跳转页面
	 *@author huang.die 
	 */
	public static ModelAndView getSimpleModelAndView4Back(String msg)
	{
		return new ModelAndView("simpleMessageView4Back")
		.addObject("msg", msg);
	}

	public static ApplicationContext getCtx() {
		return ctx;
	}

	public static IFxAccountDAO getFxAccountDAO() {
		return fxAccountDAO;
	}

	public static void setCtx(ApplicationContext ctx) {
		BaseMultiActionController.ctx = ctx;
	}

	public static void setFxAccountDAO(IFxAccountDAO fxAccountDAO) {
		BaseMultiActionController.fxAccountDAO = fxAccountDAO;
	}
	
	public static IFxAdminDAO getFxAdminDAO() {
		return fxAdminDAO;
	}

	public static void setFxAdminDAO(IFxAdminDAO fxAdminDAO) {
		BaseMultiActionController.fxAdminDAO = fxAdminDAO;
	}
}

