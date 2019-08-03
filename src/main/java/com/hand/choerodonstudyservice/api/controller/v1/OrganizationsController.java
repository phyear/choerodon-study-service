package com.hand.choerodonstudyservice.api.controller.v1;

import com.hand.choerodonstudyservice.app.service.OrganizationsService;
import com.hand.choerodonstudyservice.infra.dto.OrganizationsDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import io.choerodon.base.annotation.Permission;
import io.choerodon.base.enums.ResourceType;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/v1/organizations")
@RestController
public class OrganizationsController {

      @Resource
      OrganizationsService organizationsService;
     @GetMapping("/{id}/create")
     @ApiOperation("根据id查询获取iam的组织信息并插入数据库")
     @Permission(type = ResourceType.SITE)
     public ResponseEntity<OrganizationsDTO> create(@PathVariable("id") int id){
         OrganizationsDTO organizations=organizationsService.create(id);
         return new ResponseEntity<OrganizationsDTO>(organizations,HttpStatus.OK);

      }

    @GetMapping("/{organizations_id}")
    @ApiOperation("根据id查询获取iam的组织信息")
    @Permission(type = ResourceType.SITE)
      public ResponseEntity<OrganizationsDTO> queryById(@PathVariable("organizations_id") int id){
        return  new ResponseEntity<OrganizationsDTO>(organizationsService.queryById(id),HttpStatus.OK);
      }

}
