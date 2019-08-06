package com.hand.choerodonstudyservice.app.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.app.service.UserService;
import com.hand.choerodonstudyservice.infra.dto.UserDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import com.hand.choerodonstudyservice.infra.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    IamServiceFeign feign;
    @Resource
    UserMapper userMapper;

    @Override
    public UserDTO create(int id, int organizationId) {
        UserDTO usersDTO = feign.queryUsersByOrganization_idAndUserId(id, organizationId).getBody();
        if(usersDTO==null){
            return   null;
        }
        int i = userMapper.insertSelective(usersDTO);
        if(i>0){
            return usersDTO;
         }
         return   null;
    }


    @Override
    public PageInfo<UserDTO> pagingQuery(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        PageInfo<UserDTO> usersDTOPageInfo=new PageInfo<>(userMapper.selectAll());
        return usersDTOPageInfo;
    }
}
