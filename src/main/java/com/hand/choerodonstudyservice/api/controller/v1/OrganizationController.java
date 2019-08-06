package com.hand.choerodonstudyservice.api.controller.v1;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hand.choerodonstudyservice.infra.dto.OrganizationDTO;
import com.hand.choerodonstudyservice.app.service.OrganizationService;

import io.swagger.annotations.ApiOperation;

import io.choerodon.base.enums.ResourceType;
import io.choerodon.base.annotation.Permission;

/**
 * @author zhaotianxin
 */
@RequestMapping("/v1/organizations")
@RestController
public class OrganizationController {

    @Resource
    OrganizationService organizationService;

    @GetMapping("/{id}/create")
    @ApiOperation("根据id查询获取iam的组织信息并插入数据库")
    @Permission(type = ResourceType.SITE)
    public ResponseEntity<OrganizationDTO> create(@PathVariable("id") int id) {
        OrganizationDTO organizations = organizationService.create(id);
        return new ResponseEntity<OrganizationDTO>(organizations,HttpStatus.OK);
    }

    @GetMapping("/{organizations_id}")
    @ApiOperation("根据id查询获取iam的组织信息")
    @Permission(type = ResourceType.SITE)
      public ResponseEntity<OrganizationDTO> queryById(@PathVariable("organizations_id") int organizationId) {
        return  new ResponseEntity<OrganizationDTO>(organizationService.queryById(organizationId),HttpStatus.OK);
    }

}
