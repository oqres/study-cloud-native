package com.example.demo.util;

import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	private final JdbcTemplate jdbcTemplate;
	public CustomerService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public Collection<Customer> findAll() {
		
		RowMapper<Customer> rowMapper = (rs, i) -> new Customer(rs.getLong("ID"), rs.getString("EMAIL"));
		
		return this.jdbcTemplate.query("select * from CUSTOMERS", rowMapper);

	}

}
