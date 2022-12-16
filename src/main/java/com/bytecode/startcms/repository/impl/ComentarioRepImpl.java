package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IComentarioRep;

@Repository
public class ComentarioRepImpl implements IComentarioRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
