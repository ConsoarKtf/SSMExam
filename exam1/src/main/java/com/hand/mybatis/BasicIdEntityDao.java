package com.hand.mybatis;

import java.sql.SQLException;

import com.hand.db.EntityWithID;

public interface BasicIdEntityDao extends IDDao {
	
	public void ModifyIdEntity(EntityWithID entity) throws SQLException;
	
	public void AddIdEntity(EntityWithID entity) throws SQLException;
}
