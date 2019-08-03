package com.hand.choerodonstudyservice.api.controller.v1;

import com.github.pagehelper.PageInfo;
import com.hand.choerodonstudyservice.app.service.UsersService;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;
import io.choerodon.base.annotation.Permission;
import io.choerodon.base.enums.ResourceType;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/v1/users")
@RestController
public class UsersController {
    @Resource
    UsersService usersService;
   @GetMapping("/create")
   @ApiOperation("根据id和组织号查询获取用户信息并插入数据库")
   @Permission(type = ResourceType.SITE)
   public ResponseEntity<UsersDTO> create(int id, int organization_id){
      return  new ResponseEntity<UsersDTO>(usersService.create(id,organization_id), HttpStatus.OK);
   }

    @GetMapping
    @ApiOperation("根据id和组织号查询获取用户信息并插入数据库")
    @Permission(type = ResourceType.SITE)
    public ResponseEntity<PageInfo<UsersDTO>> queryPage(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "10") int pageSize){
        return  new ResponseEntity<PageInfo<UsersDTO>>(usersService.queryByPage(page,pageSize), HttpStatus.OK);
    }
}
