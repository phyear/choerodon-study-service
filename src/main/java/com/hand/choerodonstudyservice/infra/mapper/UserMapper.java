package com.hand.choerodonstudyservice.infra.mapper;

import com.hand.choerodonstudyservice.infra.dto.UserDTO;
import io.choerodon.mybatis.common.Mapper;

/**
 * @author zhaotianxin
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserDTO> {
}
