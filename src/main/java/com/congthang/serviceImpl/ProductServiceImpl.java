package com.congthang.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.congthang.model.Product;
import com.congthang.service.ProductService;
import com.mysql.jdbc.PreparedStatement;


public class ProductServiceImpl implements ProductService {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private JdbcTemplate jdbcTemplateObject;

	Connection conn = null;
	PreparedStatement stm = null;
//	public List<Product> getAll() {
////		String sql = "SELECT * FROM product";
////		
////		List<Product> list  = getJdbcTemplate().query(sql,
////				new BeanPropertyRowMapper(Product.class));
////			
////		return list;
//	}

}
