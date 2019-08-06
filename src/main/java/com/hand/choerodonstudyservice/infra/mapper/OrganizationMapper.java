package com.hand.choerodonstudyservice.infra.mapper;

import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaotianxin
 */
@org.apache.ibatis.annotations.Mapper
public interface OrganizationMapper extends Mapper<OrganizationDTO> {
    /**
     * 根据组织id查询组织表信息
     * @param id
     * @return
     */
    OrganizationDTO queryById(@Param("id") int id);
}
