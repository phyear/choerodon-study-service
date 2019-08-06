package com.hand.choerodonstudyservice.app.service;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.infra.dto.UserDTO;

/**
 * @author zhaotianxin
 * @date
 */
public interface UserService {
    /**
     * 根据用户id和组织Id拉取数据
     * @param userId 用户id
     * @param organizationId 组织ID
     * @return UserDTO 用户DTO
     */
    UserDTO create(int userId, int organizationId);

    /**
     * 分页查询用户
     * @param page 页码
     * @param pageSize 每页显示的记录数
     * @return PageInfo<UserDTO>
     */
    PageInfo<UserDTO> pagingQuery(int page, int pageSize);
}
