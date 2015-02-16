package com.daumkakaotrack.nextbook.db;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class DatabaseSourceProvider {

	public static DataSource getDatabaseSource() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/nextbook";
		String username = "root";
		String password = "1234";
		DataSource ds = new PooledDataSource(driver, url, username, password);
		return ds;
	}
}
