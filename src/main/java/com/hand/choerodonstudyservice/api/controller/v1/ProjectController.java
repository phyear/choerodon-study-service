package com.hand.choerodonstudyservice.api.controller.v1;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.app.service.ProjectService;
import com.hand.choerodonstudyservice.infra.dto.ProjectDTO;
import io.choerodon.base.annotation.Permission;
import io.choerodon.base.enums.ResourceType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/projects")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @GetMapping
    @ApiOperation("分页查询项目")
    @Permission(type = ResourceType.SITE)
    public  ResponseEntity<PageInfo<ProjectDTO>>  queryPage(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "10") int pageSize) {
         return new ResponseEntity(projectService.queryPage(page,pageSize),HttpStatus.OK);
    }
}
