package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IGrupoPermisoRep;


@Repository
public class GrupoPermisoRepImpl implements IGrupoPermisoRep {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
}
