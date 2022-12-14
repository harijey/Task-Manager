package com.example.userservice.model;

import java.util.Date;
import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Training {

    private String adminId;
    @Id
    private String id;
    private String name;
    private String description;
    private Date createdDate;
    private HashMap<String, Days> daysMap;

}
