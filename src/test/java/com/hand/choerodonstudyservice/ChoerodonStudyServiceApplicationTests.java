package com.hand.choerodonstudyservice;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.hand.choerodonstudyservice.infra.dto.UsersDTO;
import com.hand.choerodonstudyservice.infra.feign.IamServiceFeign;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;

@RunWith(JUnit4.class)
@SpringBootTest
public class ChoerodonStudyServiceApplicationTests {
      @Resource
      IamServiceFeign iamServiceFeign;

    @Test
    public void contextLoads() {
        UsersDTO usersDTO=new UsersDTO();
        usersDTO.setId(1L);
        Gson gson=new Gson();
        System.out.println(gson.toJson(""));

    }

}
