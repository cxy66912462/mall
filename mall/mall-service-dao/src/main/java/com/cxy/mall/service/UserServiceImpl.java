package com.cxy.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxy.mall.bean.User;
import com.cxy.mall.dao.UserDao;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> selectUser() {
		List<User> list = userDao.selectUser();
		
		return list;
	}

}
