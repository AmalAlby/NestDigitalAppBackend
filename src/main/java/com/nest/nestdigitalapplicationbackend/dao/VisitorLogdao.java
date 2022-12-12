package com.nest.nestdigitalapplicationbackend.dao;

import com.nest.nestdigitalapplicationbackend.model.VisitorLog;
import org.springframework.data.repository.CrudRepository;

public interface VisitorLogdao extends CrudRepository<VisitorLog,Integer> {
}
