package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IContenidoRep;

@Repository
public class ContenidoRepImpl implements IContenidoRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
