package com.hand.choerodonstudyservice.app.service.impl;

import javax.annotation.Resource;

import com.hand.choerodonstudyservice.app.service.OrganizationService;
import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import com.hand.choerodonstudyservice.infra.mapper.OrganizationMapper;
import com.hand.choerodonstudyservice.infra.mapper.ProjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaotianxin
 */

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Resource
    IamServiceFeign feign;
    @Resource
    OrganizationMapper organizationsMapper;
    @Resource
    ProjectMapper projectMapper;

    @Override
    @Transactional
    public OrganizationDTO create(int organizationId) {
        OrganizationDTO body = feign.queryByOrganizationId(organizationId).getBody();

        if (body == null) {
            return null;
        }
        int insertResult = organizationsMapper.insertSelective(body);
        Integer result = 0;
        if (body.getProjects() != null) {
            result = projectMapper.insertList(body.getProjects());
        }
        if (insertResult == 0) {
            return null;
        }
        return body;
    }

    @Override
    public OrganizationDTO queryById(int id) {
        return organizationsMapper.queryById(id);
    }
}
