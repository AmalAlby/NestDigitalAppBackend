package com.nest.nestdigitalapplicationbackend.dao;

import com.nest.nestdigitalapplicationbackend.model.SecurityModel;
import org.springframework.data.repository.CrudRepository;

public interface Securitydao extends CrudRepository<SecurityModel,Integer> {
}
