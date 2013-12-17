package com.accelet.dao;

import java.sql.SQLException;
import com.accelet.entity.FxAdminEntity;


public interface IFxAdminDAO {
	public FxAdminEntity queryByAdmin(String admin) throws SQLException;
}
