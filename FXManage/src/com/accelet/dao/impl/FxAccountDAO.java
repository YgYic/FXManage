package com.accelet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.accelet.dao.IFxAccountDAO;
import com.accelet.entity.FxAccountEntity;

public class FxAccountDAO implements IFxAccountDAO{
	
	private DataSource dataSource;
	
	public List<FxAccountEntity> queryAll() throws SQLException{
		Connection conn = null;
		ResultSet rs = null;
		try{
			conn = dataSource.getConnection();
			String sql = "select sn, fx_admin, fx_pwd, simcard_type, user_type, create_time, status, user_limit, " +
					"free_sms_limit, online_flag, thread_no from fx_account limit ?,?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 0);
			stmt.setInt(2, 10);
			rs = stmt.executeQuery();
			List<FxAccountEntity> fxAccountList = new ArrayList<FxAccountEntity>(); 
			while (rs.next()) {
				FxAccountEntity entity = new FxAccountEntity();
				entity.setSn(rs.getInt("sn"));
				entity.setFxAdmin(rs.getString("fx_admin"));
				entity.setFxPwd(rs.getString("fx_pwd"));
				entity.setSimcardType(rs.getInt("simcard_type"));
				entity.setUserType(rs.getInt("user_type"));
				entity.setCreateTime(rs.getTimestamp("create_time"));
				entity.setStatus(rs.getInt("status"));
				entity.setUserLimit(rs.getInt("user_limit"));
				entity.setFreeSmsLimit(rs.getInt("free_sms_limit"));
				entity.setOnlineFlag(rs.getInt("online_flag"));
				entity.setThreadNo(rs.getInt("thread_no"));
				fxAccountList.add(entity);
			}
			return fxAccountList;
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
