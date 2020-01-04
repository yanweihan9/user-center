package com.youngzi.usercenter.controller.user;

import com.youngzi.usercenter.domain.entity.user.User;
import com.youngzi.usercenter.service.uesr.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService userService;

    @RequestMapping("/{id}")
    public User findById(@PathVariable Integer id){
        log.info("===========qingqiu");
        return userService.findById(id);
    }
}
