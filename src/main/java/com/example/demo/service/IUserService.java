package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;


import java.util.List;

/**
 * @author pdai
 */
public interface IUserService extends IService<User> {

    List<User> findList(User userQueryBean);

}

