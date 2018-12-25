package com.myweb.feign;

import com.myweb.api.user.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app-user")
public interface UserFeign extends UserService {
    @RequestMapping("/user")
    @Override
    String getUserService();
}
