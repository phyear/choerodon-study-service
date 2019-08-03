package com.hand.choerodonstudyservice.infra.mapper;

import com.hand.choerodonstudyservice.infra.dto.OrganizationsDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

@org.apache.ibatis.annotations.Mapper
public interface OrganizationMapper extends Mapper<OrganizationsDTO> {
    OrganizationsDTO queryById(@Param("id") int id);
}
