package com.hand.choerodonstudyservice.app.service;

import com.hand.choerodonstudyservice.infra.dto.OrganizationsDTO;

public interface OrganizationsService {

    OrganizationsDTO create(int organizations);

    OrganizationsDTO queryById(int id);
}
