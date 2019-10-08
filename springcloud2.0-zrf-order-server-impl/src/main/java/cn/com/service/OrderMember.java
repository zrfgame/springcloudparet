package cn.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrf.entity.UserEntity;

import cn.com.fegin.OrderIMemberFegin;

@RestController
public class OrderMember implements com.zrf.service.OrderMember {
	@Autowired
	private OrderIMemberFegin orderIMemberFegin;
	@RequestMapping("/OrderMembers")
	public String OrderMembers() {
		UserEntity user =orderIMemberFegin.getMember("朱荣飞", "22");
		return "我是"+user.getName()+",我今年"+user.getAge()+"岁";
	}

}
