package com.coddingshuttle.springboottutorial.springbootwebtutorial.DTO;

import java.time.LocalDate;

public class Employee_dto {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate DateOfJoining;
    private Boolean inActive;

    public void setId(Long id) {
        this.id = id;
    }

    public void setInActive(Boolean inActive) {
        this.inActive = inActive;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public Boolean getInActive() {
        return inActive;
    }

    public LocalDate getDateOfJoining() {
        return DateOfJoining;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Employee_dto(LocalDate dateOfJoining, Long id, String name, String email, Integer age, Boolean inActive) {
        DateOfJoining = dateOfJoining;
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.inActive = inActive;
    }
    public Employee_dto(){}
}
