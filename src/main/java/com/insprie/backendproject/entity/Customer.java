package com.insprie.backendproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "customerdim")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;

    private String customername;

    private Date customerbirthday;

    private String customergender;

    private String customerphonenumber;

    private String customeremail;
}
