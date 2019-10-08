package com.zrf.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderMember {
	@RequestMapping("/OrderMembers")
	public String OrderMembers();
}
