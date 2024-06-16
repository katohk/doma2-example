package com.github.katohk.sample.doma2.db002;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.github.katohk.sample.doma2.AppDomaConfig;

@Configuration
@ImportResource({"classpath:dbconfig002.xml"})
public class DomaConfig002 {

	// see @ConfigAutowireble002
    @Bean(name = "domaconfig002")
    AppDomaConfig domaconfig002(
            @Qualifier("dialect002") Dialect dialect,
            @Qualifier("dataSource002") DataSource dataSource) {
		return new AppDomaConfig(dialect, dataSource);
	}

	// see @Transaactional002
    @Bean(name = "txManager002")
    DataSourceTransactionManager txManager002(
            @Qualifier("dataSource002") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
    }
}
