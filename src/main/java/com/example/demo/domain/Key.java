package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Key {

    @Id
    private long id;
    private long key;

    public Key(long key){
        this.key=key;
    }
}
