package com.zrf.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zrf.entity.UserEntity;
import com.zrf.service.MemberService;
@RestController
public class IMemberService implements MemberService {

	@RequestMapping("/getMember")
	public UserEntity getMember(@RequestParam("name") String name,@RequestParam("age")  String age) {
		UserEntity user = new UserEntity();
		user.setName(name);
		user.setAge(age);
		return user;
	}

}
