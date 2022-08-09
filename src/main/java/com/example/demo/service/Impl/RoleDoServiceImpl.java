package com.example.demo.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.IRoleDao;
import com.example.demo.entity.Role;
import com.example.demo.service.IRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RoleDoServiceImpl extends ServiceImpl<IRoleDao, Role> implements IRoleService {

    @Override
    public List<Role> findList(Role roleQueryBean) {
        return lambdaQuery().like(StringUtils.isNotEmpty(roleQueryBean.getName()), Role::getName, roleQueryBean.getName())
                .like(StringUtils.isNotEmpty(roleQueryBean.getDescription()), Role::getDescription, roleQueryBean.getDescription())
                .like(StringUtils.isNotEmpty(roleQueryBean.getRoleKey()), Role::getRoleKey, roleQueryBean.getRoleKey())
                .list();
    }
}
