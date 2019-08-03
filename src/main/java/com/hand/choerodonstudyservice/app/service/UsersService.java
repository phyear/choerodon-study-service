package com.hand.choerodonstudyservice.app.service;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;

public interface UsersService {
    UsersDTO create(int id, int organization_id);

    PageInfo<UsersDTO> queryByPage(int page, int pageSize);
}
