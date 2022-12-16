package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IGrupoRep;

@Repository
public class GrupoRepImpl implements IGrupoRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
