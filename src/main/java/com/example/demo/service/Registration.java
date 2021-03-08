package com.example.demo.service;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Key;

public interface Registration {

    void saveCustomer(Customer customer);
    Customer encryptCustomer(Customer customer);
    Customer decodeCustomer(Customer customer);
}
