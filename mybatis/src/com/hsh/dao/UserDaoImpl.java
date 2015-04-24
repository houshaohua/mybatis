package com.hsh.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hsh.po.User;

@Repository("iUserDao") 
public class UserDaoImpl implements IUserDao {
	
	/*sql 语句*/  
    private static final String INSERT = "insert";  
    private static final String UPDATE = "update";     
    private static final String DELETE = "delete";     
    private static final String SELECTALL = "selectAll";     
    private static final String SELECTBYID = "selectById"; 
	
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public boolean delete(int id) {
		 String sql = this.getStatementId(User.class, DELETE);  
	     sqlSession.delete(sql, id);  
	     return true;  
	}

	public List<User> findAll() {
		String sql = this.getStatementId(User.class, SELECTALL);  
        List<User> list = sqlSession.selectList(sql);  
        return list;  
	}

	public User findById(int id) {
		String sql = this.getStatementId(User.class, SELECTBYID);  
		User user = (User)sqlSession.selectOne(sql, id);  
        return user; 
	}

	public boolean insert(User user) {
		String sql = this.getStatementId(User.class, INSERT);  
        this.sqlSession.insert(sql, user);  
		return true;
	}

	public boolean update(User user) {
		String sql = this.getStatementId(User.class, UPDATE);  
        this.sqlSession.insert(sql, user);  
		return true;
	}
	/**
	 * 构建Id全名
	 * @param entityClass
	 * @param suffix
	 * @return
	 */
    private String getStatementId(Class entityClass, String suffix){  
        String sqlStr = entityClass.getName() + "." + suffix;   
        return sqlStr;  
    }  

}
