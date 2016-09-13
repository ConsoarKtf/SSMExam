package com.hand.db;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.mybatis.IDDao;
import com.hand.db.EntityWithID;
import com.hand.db.Address;

public class AddressDaoSp extends SqlSessionDaoSupport implements IDDao {
	
	public EntityWithID getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Address",ID);
	}

	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Address", ID);
	}
	
	public int getCountById(long ID) throws SQLException{
		return this.getSqlSession().selectOne("getCountById_Address",ID);
	}
	
	public List<Address> getAllAddress(){
		List<Address> la=this.getSqlSession().selectList("getAllAddress_Address");
		return la;
	}
}
