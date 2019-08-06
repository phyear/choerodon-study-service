package com.hand.choerodonstudyservice.infra.feign;

import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;
import com.hand.choerodonstudyservice.infra.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhaotianxin
 */
@FeignClient("iam-service")
public interface IamServiceFeign {
    /**
     * 根据组织Id从iam服务中获取组织信息
     * @param id
     * @return ResponseEntity<OrganizationDTO> 组织DTO
     */
    @GetMapping("v1/organizations/{organization_id}")
    public ResponseEntity<OrganizationDTO> queryByOrganizationId(@PathVariable("organization_id") int id);

    /**
     * 根据组织Id和用户Id查询用户信息
     * @param organization_id 组织Id
     * @param id 用户Id
     * @return ResponseEntity<UserDTO> 用户DTO
     *
     */
    @GetMapping("v1/organizations/{organization_id}/users/{id}")
    public ResponseEntity<UserDTO> queryUsersByOrganizationIdAndUserId(@PathVariable("organization_id") int organization_id, @PathVariable("id") int id);
}
