package com.hand.choerodonstudyservice.app.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.hand.choerodonstudyservice.app.service.UsersService;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import com.hand.choerodonstudyservice.infra.mapper.UsersMapper;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    IamServiceFeign feign;
    @Resource
    UsersMapper usersMapper;

    @Override
    public UsersDTO create(int id, int organization_id) {
        UsersDTO usersDTO = feign.queryUsersByOrganization_idAndUserId(organization_id, id).getBody();
        if(usersDTO==null){
            return   null;
        }
        int i = usersMapper.insertSelective(usersDTO);
        if(i>0){
            return usersDTO;
         }
         return   null;
    }

    @Override
    public PageInfo<UsersDTO> queryByPage(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        PageInfo<UsersDTO> usersDTOPageInfo=new PageInfo<>(usersMapper.selectAll());
        return usersDTOPageInfo;
    }
}
