package com.study.cloud.dao;

import com.study.cloud.model.User;

import java.util.List;


public interface UserDao {

	List<User> findAll();
}
