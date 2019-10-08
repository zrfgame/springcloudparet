package cn.com.fegin;

import org.springframework.cloud.openfeign.FeignClient;

import com.zrf.service.MemberService;
@FeignClient(name="APP-MUMBER")
public interface OrderIMemberFegin extends MemberService {

}
