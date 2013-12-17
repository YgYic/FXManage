package com.accelet.dao;

import java.sql.SQLException;
import java.util.List;

import com.accelet.entity.FxAccountEntity;


public interface IFxAccountDAO {
	public List<FxAccountEntity> queryAll() throws SQLException;
}
