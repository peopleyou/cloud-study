package com.study.cloud.domain;


import com.study.cloud.dao.UserDao;
import com.study.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class UserService {


	@Autowired
	private UserDao userMapper;

	public List<User> searchAll(){
		List<User> list = userMapper.findAll();
		return list;
	}
}
