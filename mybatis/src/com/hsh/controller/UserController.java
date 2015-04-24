package com.hsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hsh.po.User;
import com.hsh.service.IUserService;
import com.mysql.jdbc.StringUtils;

@Controller
public class UserController {
	
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping(value = "/toAdd")
	public String toAdd(){
		return "add";
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST) 
	public String add(User user){
		this.iUserService.insert(user);
		return "redirect:/user/toList";
	}
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(Model model, int id){
		User u = this.iUserService.findById(id);
		model.addAttribute("user", u);
		return "update";
	}
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST) 
	public String update(User user){
		this.iUserService.update(user);
		return "redirect:/user/toList";
	}
	@RequestMapping(value = "/toList")
	public String toList(Model model){
		List<User> users = this.iUserService.findAll();
		model.addAttribute("users", users);
		return "list";
	}
	@RequestMapping(value = "/deleteUser")
	public String delete(int id){
		this.iUserService.delete(id);
		return "redirect:/user/toList";
	}
}
