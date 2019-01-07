package com.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;

import lombok.Setter;

@Setter
@Service("userService")
public class UserService {
		@Autowired
		private UserDao userDao;
	
		public void add() {
			System.out.println(" UserService add..............................");
			/*int i=1/0;//伪造异常通知*/			
			userDao.add();
		}
}
