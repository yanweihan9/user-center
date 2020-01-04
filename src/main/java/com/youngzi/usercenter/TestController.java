package com.youngzi.usercenter;

import com.youngzi.usercenter.dao.user.UserMapper;
import com.youngzi.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    private final UserMapper userMapper;

    @GetMapping("/test")
    private User testInsert(){
        User user = new User().builder().wxId("a").roles("b").build();
        user.setAvatarUrl("aaa");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setWxId("1");
        user.setWxNickname("a1");
        userMapper.insertSelective(user);
        return user;
    }


}
