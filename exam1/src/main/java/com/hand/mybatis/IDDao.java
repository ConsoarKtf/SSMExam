package com.hand.mybatis;

import java.sql.SQLException;

import com.hand.db.EntityWithID;

public interface IDDao {
	
	public EntityWithID getByID(long ID) throws SQLException;

	public void delByID(long ID) throws SQLException;
}
