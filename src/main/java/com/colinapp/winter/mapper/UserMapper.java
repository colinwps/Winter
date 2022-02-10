package com.colinapp.winter.mapper;

import com.colinapp.winter.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUser(int id);

    /**
     * 新增用户信息
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据Id删除用户信息
     * @param id
     * @return
     */
    int deleteUserById(int id);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();

}
