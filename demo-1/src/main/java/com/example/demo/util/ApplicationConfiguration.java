package com.example.demo.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan("com.example.demo.util")
public class ApplicationConfiguration {

	
	@Bean(destroyMethod="shutdown")
	DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setName("customers").setType(EmbeddedDatabaseType.H2).build();
	}
	
	@Bean
	JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	
	
}
