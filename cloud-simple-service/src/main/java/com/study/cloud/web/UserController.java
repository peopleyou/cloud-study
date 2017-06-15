package com.study.cloud.web;

import com.study.cloud.domain.UserService;
import com.study.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();
		return ls;
	}

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
}
