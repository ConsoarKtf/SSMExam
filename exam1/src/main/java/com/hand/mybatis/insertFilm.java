package com.hand.mybatis;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.db.EntityWithID;

public class insertFilm extends SqlSessionDaoSupport implements IDDao {

	public EntityWithID getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Film",ID);
	}

	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Film",ID);
	}
	public void AddIdEntity(EntityWithID entity) throws SQLException {
		this.getSqlSession().insert("addId_Film", entity);

	}
}
