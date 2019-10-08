package com.zrf.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zrf.entity.UserEntity;

public interface MemberService {
	@RequestMapping("/getMember")
	public UserEntity getMember(@RequestParam("name") String name,@RequestParam("age") String age);
}
