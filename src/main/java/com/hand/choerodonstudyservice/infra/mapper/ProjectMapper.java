package com.hand.choerodonstudyservice.infra.mapper;

import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ProjectMapper  extends Mapper<ProjectDTO> {
    Integer  insertList(@Param("projects") List<ProjectDTO> projects);

    List<ProjectDTO> queryByOrganizationId(@Param("id") int id);
}
