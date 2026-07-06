package com.coddingshuttle.springboottutorial.springbootwebtutorial.repositories;

import com.coddingshuttle.springboottutorial.springbootwebtutorial.entities.Employee_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Employee_repos extends JpaRepository<Employee_entity, Long >{


    
}
