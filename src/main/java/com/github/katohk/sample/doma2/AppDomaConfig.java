package com.github.katohk.sample.doma2;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

/**
 * Doma Configuration
 */
public class AppDomaConfig implements Config{
	
	private Dialect dialect;
	private DataSource dataSource;

	public AppDomaConfig (Dialect dialect, DataSource dataSource) {
		this.dialect = dialect;
		this.dataSource = dataSource;
	}

	@Override
	public DataSource getDataSource() {
		return new TransactionAwareDataSourceProxy(dataSource);
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}
	
}
