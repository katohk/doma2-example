package com.github.katohk.sample.doma2.db001;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.github.katohk.sample.doma2.AppDomaConfig;

@Configuration
@ImportResource({"classpath:dbconfig001.xml"})
public class DomaConfig001 {

	// see @ConfigAutowireble001
    @Bean(name = "domaconfig001")
    @Primary
    AppDomaConfig domaconfig001(
            @Qualifier("dialect001") Dialect dialect,
            @Qualifier("dataSource001") DataSource dataSource) {
		return new AppDomaConfig(dialect, dataSource);
	}

	// see @Transactional001
    @Bean(name = "txManager001")
    DataSourceTransactionManager txManager001(
            @Qualifier("dataSource001") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
    }
}
