package com.accelet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.accelet.dao.IFxAdminDAO;
import com.accelet.entity.FxAdminEntity;

public class FxAdminDAO implements IFxAdminDAO{
	
	private DataSource dataSource;
	
	public FxAdminEntity queryByAdmin(String admin) throws SQLException{
		Connection conn = null;
		ResultSet rs = null;
		try{
			conn = dataSource.getConnection();
			String sql = "select admin_sn,admin_name,admin_pwd,valid_flag from admin_info where admin_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, admin);
			rs = stmt.executeQuery();
			FxAdminEntity fxAdmin = new FxAdminEntity(); 
			if(rs.next()) {
				fxAdmin.setSn(rs.getInt("admin_sn"));
				fxAdmin.setPwd(rs.getString("admin_pwd"));
				fxAdmin.setValidFlag(rs.getInt("valid_flag"));
			}
			return fxAdmin;
		}catch (Exception e) {
			e.printStackTrace();
			throw new SQLException();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {}	
			try{
				conn.close();
			}catch (Exception e) {}
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
