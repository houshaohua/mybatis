package com.hsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsh.dao.IUserDao;
import com.hsh.po.User;

@Service("iUserService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao iUserDao;
	
	public boolean delete(int id) {
		this.iUserDao.delete(id);
		return true;
	}

	public List<User> findAll() {
		return this.findAll();
	}

	public User findById(int id) {
		return this.findById(id);
	}

	public boolean insert(User user) {
		this.iUserDao.insert(user);
		return true;
	}

	public boolean update(User user) {
		this.iUserDao.update(user);
		return true;
	}

}
