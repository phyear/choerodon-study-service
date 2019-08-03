package com.hand.choerodonstudyservice.app.service;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;

public interface ProjectService {

    PageInfo<ProjectDTO> queryPage(int page,int pageSize);
}
