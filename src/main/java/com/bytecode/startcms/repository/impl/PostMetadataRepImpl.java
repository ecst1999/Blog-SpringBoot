package com.bytecode.startcms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.repository.IPostMetadataRep;

@Repository
public class PostMetadataRepImpl implements IPostMetadataRep {

	@Autowired
	private JdbcTemplate jdbcTemplate;
}
