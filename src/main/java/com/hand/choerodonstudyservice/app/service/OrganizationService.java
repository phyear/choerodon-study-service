package com.hand.choerodonstudyservice.app.service;

import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;

/**
 * @author zhaotianxin
 * @email ztxemail@163.com
 */
public interface OrganizationService {

    OrganizationDTO create(int organizations);

    OrganizationDTO queryById(int id);
}
