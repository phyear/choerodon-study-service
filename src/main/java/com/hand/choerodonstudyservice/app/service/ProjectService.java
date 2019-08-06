package com.hand.choerodonstudyservice.app.service;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;

/**
 * @author zhaotianxin
 */
public interface ProjectService {
    /**
     * 分页查询项目信息
     * @param page 跳转页
     * @param pageSize 每页显示的记录数
     * @return PageInfo<ProjectDTO> PageInfo
     */
    PageInfo<ProjectDTO> queryPage(int page,int pageSize);
}
