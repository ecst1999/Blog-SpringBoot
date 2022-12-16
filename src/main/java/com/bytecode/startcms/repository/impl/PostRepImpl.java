package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IPostRep;

@Repository
public class PostRepImpl implements IPostRep{

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
