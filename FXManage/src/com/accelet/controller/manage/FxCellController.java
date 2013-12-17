package com.accelet.controller.manage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.accelet.baseclass.BaseMultiActionController;
import com.accelet.entity.FxAccountEntity;

public class FxCellController extends BaseMultiActionController {
	private String fxAccountsListView;
	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<FxAccountEntity> fxAccountList = getFxAccountDAO().queryAll();
		return new ModelAndView(getFxAccountsListView()).addObject("fxAccountList", fxAccountList);
	}
	public String getFxAccountsListView() {
		return fxAccountsListView;
	}
	public void setFxAccountsListView(String fxAccountsListView) {
		this.fxAccountsListView = fxAccountsListView;
	}

}
