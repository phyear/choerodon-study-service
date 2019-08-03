package com.hand.choerodonstudyservice.app.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hand.choerodonstudyservice.app.service.OrganizationsService;
import com.hand.choerodonstudyservice.infra.dto.OrganizationsDTO;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import com.hand.choerodonstudyservice.infra.mapper.OrganizationMapper;
import com.hand.choerodonstudyservice.infra.mapper.ProjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
public class OrganizationsServiceImpl implements OrganizationsService {
    @Resource
    IamServiceFeign feign;
    @Resource
    OrganizationMapper organizationsMapper;
    @Resource
    ProjectMapper projectMapper;
    @Override
    @Transactional
    public OrganizationsDTO create(int organizations) {
        OrganizationsDTO body = feign.queryByOrganization_id(organizations).getBody();

        if(body==null){ return null;}
        int a=organizationsMapper.insertSelective(body);
        Integer i=0;
        if(body.getProjects()!=null){
            i=projectMapper.insertList(body.getProjects());
        }
        if(a==0){
            return null;
        }
        return body;
    }

    @Override
    public OrganizationsDTO queryById(int id) {
        return organizationsMapper.queryById(id);
    }
}
