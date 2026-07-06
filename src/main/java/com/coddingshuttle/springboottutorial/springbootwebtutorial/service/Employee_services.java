package com.coddingshuttle.springboottutorial.springbootwebtutorial.service;

import com.coddingshuttle.springboottutorial.springbootwebtutorial.DTO.Employee_dto;
import com.coddingshuttle.springboottutorial.springbootwebtutorial.entities.Employee_entity;
import com.coddingshuttle.springboottutorial.springbootwebtutorial.repositories.Employee_repos;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Employee_services {

    private final Employee_repos employeeRepository;
    private final ModelMapper modelMapper;

    public Employee_services(Employee_repos employeeRepos, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepos;
        this.modelMapper = modelMapper;
    }

    public Employee_dto getEmployeeId(Long id) {
        Employee_entity employeeEntity = employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, Employee_dto.class);
    }

    public List<Employee_dto> getAllEmployees() {
        List<Employee_entity> employeeEntities = employeeRepository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity ->modelMapper.map(employeeEntity,Employee_dto.class))
                .collect(Collectors.toList());

    }

    public Employee_dto createNewEmployee(@RequestBody Employee_dto inputEmployee) {
        Employee_entity toSaveEntity =  modelMapper.map(inputEmployee, Employee_entity.class);
        Employee_entity savedEmployeeEntity = employeeRepository.save(toSaveEntity);
        return modelMapper.map(savedEmployeeEntity, Employee_dto.class);
    }


    public Employee_dto updateEmployeeById(Long employeeId, Employee_dto employeeDto) {
        Employee_entity employeeEntity = modelMapper.map(employeeDto, Employee_entity.class);
        employeeEntity.setId(employeeId);
        Employee_entity savedEmployeeEntity = employeeRepository.save(employeeEntity);
        return modelMapper.map(savedEmployeeEntity, Employee_dto.class);
    }

}
