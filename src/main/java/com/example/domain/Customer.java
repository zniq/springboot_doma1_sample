package com.example.domain;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
public class Customer {
	public Integer id;

	public String name;

	public String monthlySalary;
}
