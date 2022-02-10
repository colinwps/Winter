package com.colinapp.winter.controller;

import com.colinapp.winter.entity.User;
import com.colinapp.winter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户信息管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据考勤号获取用户信息",notes = "")
    @RequestMapping(value = "getUser/{id}",method = RequestMethod.GET)
    public User GetUser(@ApiParam(value = "考勤号",required = true) @PathVariable int id){
        return  userService.getUser(id);
    }

}
