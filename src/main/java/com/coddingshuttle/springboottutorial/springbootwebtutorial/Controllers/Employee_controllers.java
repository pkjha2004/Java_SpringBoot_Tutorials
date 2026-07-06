package com.coddingshuttle.springboottutorial.springbootwebtutorial.Controllers;

import com.coddingshuttle.springboottutorial.springbootwebtutorial.DTO.Employee_dto;
import com.coddingshuttle.springboottutorial.springbootwebtutorial.entities.Employee_entity;
import com.coddingshuttle.springboottutorial.springbootwebtutorial.repositories.Employee_repos;
import com.coddingshuttle.springboottutorial.springbootwebtutorial.service.Employee_services;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;



@RestController
@RequestMapping(path = "/employee")
public class Employee_controllers {
    private final Employee_services employeeService;


    public Employee_controllers(Employee_repos employeeRepositories, Employee_services employeeService) {
        this.employeeService = employeeService;
    }

    //    @GetMapping(path = "/getSecretMessage")
//    public String getmySuperSectretMessage(){
//        return "Secret message : asdfal@$DASD";
//    }
    @GetMapping(path = "/{employeeId}")
    public Employee_dto getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeId(id);
    }

    @GetMapping
    public List<Employee_dto> getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortby){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public String createNewEmployee(){
        return "Hello from Post";
    }

    @PostMapping
    public Employee_dto createNewEmployee(@RequestBody Employee_dto inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);

    }
    // @RequestBOdy- Annotation is used to directly Map the HTTP request body(usually in Json or XMl format) directly into a Java Objects
    @PutMapping(path ="/{employeeId}" ) Employee_dto updateEmployeeById(@RequestBody Employee_dto employeeDto, @PathVariable Long employeeId){
        return employeeService.updateEmployeeById(employeeId, employeeDto);
    }


}
