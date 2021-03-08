package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lombok.Setter;


@Entity
@Slf4j
@Setter
@Getter
public class Customer {

    @Id  
    private long id;
    private long key;
    private String firstName;
    private String lastName;
    private Date registrationDate;


    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationDate = new Date();
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', registrationDate='%s']",
                id, firstName, lastName, registrationDate);
    }

    public Long getId() {
        return id;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
