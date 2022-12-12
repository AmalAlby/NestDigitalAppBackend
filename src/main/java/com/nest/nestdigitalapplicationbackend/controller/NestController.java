package com.nest.nestdigitalapplicationbackend.controller;

import com.nest.nestdigitalapplicationbackend.dao.EmpLeaveCount;
import com.nest.nestdigitalapplicationbackend.dao.Employeedao;
import com.nest.nestdigitalapplicationbackend.dao.Securitydao;
import com.nest.nestdigitalapplicationbackend.dao.VisitorLogdao;
import com.nest.nestdigitalapplicationbackend.model.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class NestController {

    @Autowired
    private Employeedao dao;

    @Autowired
    private EmpLeaveCount cdao;

    @Autowired
    private Securitydao secdao;

    @Autowired
    private VisitorLogdao vdao;



    @CrossOrigin(origins = "*")
    @PostMapping(path="/addemp",consumes="application/json",produces ="application/json")
    public HashMap<String,String> AddEmployee(@RequestBody EmployeeModel e){
        EmpLeaveCountModel em =new EmpLeaveCountModel();
        String name=e.getName();
        dao.save(e);
        em.setEmpid(e.getId());
        em.setName(e.getName());
        em.setCasualleave(20);
        em.setSickleave(7);
        em.setSpecialeave(3);
        cdao.save(em);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/empview")
    public List<EmployeeModel> ViewEmployee(){
        return (List<EmployeeModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/empsearch",consumes = "application/json",produces ="application/json")
    public List<EmployeeModel> SearchEmployee(@RequestBody EmployeeModel e){
        return (List<EmployeeModel>) dao.SearchEmp(e.getEmpcode());
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/deletemp",consumes="application/json",produces ="application/json")
    public HashMap<String,String> DeleteEmployee(@RequestBody EmployeeModel e) {
        dao.DeleteEmp(e.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/addsec",consumes="application/json",produces ="application/json")
    public HashMap<String,String> AddSecurity(@RequestBody SecurityModel s) {
        secdao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addvisitor",consumes="application/json",produces ="application/json")
    public HashMap<String,String> AddVisitor(@RequestBody VisitorLog s) {
        vdao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

}
