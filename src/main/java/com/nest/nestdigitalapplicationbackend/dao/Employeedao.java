package com.nest.nestdigitalapplicationbackend.dao;

import com.nest.nestdigitalapplicationbackend.model.EmployeeModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employeedao extends CrudRepository<EmployeeModel,Integer> {
    @Query(value = "SELECT `id`, `address`, `email`, `empcode`, `name`, `password`, `phonenumber` FROM `employee` WHERE `empcode`=:empcode",nativeQuery = true)
    List<EmployeeModel> SearchEmp(@Param("empcode") String empcode);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void DeleteEmp(@Param("id") Integer id);
}
