package com.scratchback.spring.db;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class SessionManager {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public SqlSession createSession(Class mapperClass) {
		DataSource dataSource = DatabaseSourceFactory.getDatabaseSource();

		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development",
				transactionFactory, dataSource);

		Configuration configuration = new Configuration(environment);

		configuration.addMapper(mapperClass);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(configuration);

		SqlSession session = sqlSessionFactory.openSession();

		return session;
	}
}
