package com.hand.choerodonstudyservice.infra.mapper;

import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhaotianxin
 */
@org.apache.ibatis.annotations.Mapper
public interface ProjectMapper  extends Mapper<ProjectDTO> {

    /**
     * 批量添加项目
     * @param projects 项目
     * @return 操作结果
     */
    Integer  insertList(@Param("projects") List<ProjectDTO> projects);

    /**
     * 根据组织Id查询项目
     * @param id 组织Id
     * @return List<ProjectDTO> 
     */
    List<ProjectDTO> queryByOrganizationId(@Param("id") int id);
}
