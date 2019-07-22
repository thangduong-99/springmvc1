package com.congthang.mapper;

import org.springframework.jdbc.core.RowMapper;

import com.congthang.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("productId"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getInt("price"));
		product.setUrl(rs.getString("url"));
		return product;
	}

}
