package com.nest.nestdigitalapplicationbackend.dao;

import com.nest.nestdigitalapplicationbackend.model.EmpLeaveCountModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmpLeaveCount extends CrudRepository<EmpLeaveCountModel,Integer> {

}
