package com.example.demo.service;

import java.util.Base64;


public class Encryption {

    public String encrypt(String name){

        String encodedName = Base64.getEncoder().encodeToString(name.getBytes());
        return encodedName;
    }

    public String Decode(String encodedName){

        byte[] decodedBytes = Base64.getDecoder().decode(encodedName);
        String name = new String(decodedBytes);
        return name;
    }
}
