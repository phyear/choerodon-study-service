package com.hand.choerodonstudyservice.app.service;

import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;

/**
 * @author zhaotianxin
 * @email ztxemail@163.com
 */
public interface OrganizationService {

    /**
     * 添加组织
     * @param organizationId 组织Id
     * @return 组织DTO
     */
    OrganizationDTO create(int organizationId);

    /**
     * 查询组织
     * @param organizationId 组织Id
     * @return 组织DTO
     */
    OrganizationDTO queryById(int organizationId);
}
