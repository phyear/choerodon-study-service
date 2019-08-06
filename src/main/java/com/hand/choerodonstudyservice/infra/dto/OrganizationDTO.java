package com.hand.choerodonstudyservice.infra.dto;

import io.choerodon.mybatis.entity.BaseDTO;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @author zhaotianxin
 */
@Table(name = "tb_organization")
public class OrganizationDTO {
   @Id
   @ApiModelProperty("组织编号")
   private Long id;

   private String name;

   private String code;
   @Column(name = "user_id")
   private Long userId;

   private List<ProjectDTO> projects;
   @Column(name = "owner_login_name")
   private String ownerLoginName;
    @Column(name= "owner_realName")
   private String ownerRealName;
   @Column(name= "owner_phone")
   private String ownerPhone;
   @Column(name= "owner_email")
   private String ownerEmail;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   public List<ProjectDTO> getProjects() {
      return projects;
   }

   public void setProjects(List<ProjectDTO> projects) {
      this.projects = projects;
   }

   public String getOwnerLoginName() {
      return ownerLoginName;
   }

   public void setOwnerLoginName(String ownerLoginName) {
      this.ownerLoginName = ownerLoginName;
   }

   public String getOwnerRealName() {
      return ownerRealName;
   }

   public void setOwnerRealName(String ownerRealName) {
      this.ownerRealName = ownerRealName;
   }

   public String getOwnerPhone() {
      return ownerPhone;
   }

   public void setOwnerPhone(String ownerPhone) {
      this.ownerPhone = ownerPhone;
   }

   public String getOwnerEmail() {
      return ownerEmail;
   }

   public void setOwnerEmail(String ownerEmail) {
      this.ownerEmail = ownerEmail;
   }

   @Override
   public String toString() {
      return "OrganizationDTO{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", code='" + code + '\'' +
              ", userId=" + userId +
              ", projects=" + projects +
              ", ownerLoginName='" + ownerLoginName + '\'' +
              ", ownerRealName='" + ownerRealName + '\'' +
              ", ownerPhone='" + ownerPhone + '\'' +
              ", ownerEmail='" + ownerEmail + '\'' +
              '}';
   }
}
