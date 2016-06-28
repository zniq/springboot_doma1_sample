package com.example.domain;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.example.DaoConfigAutowireable;

@Dao
@DaoConfigAutowireable
public interface CustomerRepository {
	@Select
	List<Customer> selectAll();

	@Select
	Customer selectById(int id);

}
