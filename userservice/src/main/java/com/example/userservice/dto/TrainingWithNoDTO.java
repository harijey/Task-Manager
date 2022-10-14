package com.example.userservice.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TrainingWithNoDTO {

    private String id;
    private String name;
    private String description;
    private Date createdDate;
    private int noOfDays;
    private int noOfTasks;

}
