package com.hand.choerodonstudyservice.app.service.impl;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.app.service.ProjectService;
import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;
import com.hand.choerodonstudyservice.infra.mapper.ProjectMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;



@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    ProjectMapper projectMapper;

    @Override
    public PageInfo<ProjectDTO> queryPage(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        PageInfo<ProjectDTO> pageInfo = new PageInfo<>(projectMapper.selectAll());
        return pageInfo;
    }
}
