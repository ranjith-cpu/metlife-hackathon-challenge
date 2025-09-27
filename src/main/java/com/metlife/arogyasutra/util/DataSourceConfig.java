package com.metlife.arogyasutra.util;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

public class DataSourceConfig {
	
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	

}
