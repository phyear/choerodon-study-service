package com.hand.choerodonstudyservice.infra.feign;

import com.hand.choerodonstudyservice.infra.dto.OrganizationsDTO;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("iam-service")
public interface IamServiceFeign {
    @GetMapping("v1/organizations/{organization_id}")
    public ResponseEntity<OrganizationsDTO> queryByOrganization_id(@PathVariable("organization_id") int id);

    @GetMapping("v1/organizations/{organization_id}/users/{id}")
    public ResponseEntity<UsersDTO> queryUsersByOrganization_idAndUserId(@PathVariable("organization_id") int organization_id, @PathVariable("id") int id);
}
