package com.hsh.service;

import java.util.List;

import com.hsh.po.User;

public interface IUserService {
	
	public boolean insert(User user);  
    public boolean delete(int id);  
    public boolean update(User user);    
    public List<User> findAll();    
    public User findById(int id);
    
}
