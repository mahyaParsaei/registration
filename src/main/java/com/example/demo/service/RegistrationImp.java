package com.example.demo.service;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Key;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistrationImp implements Registration {


    Encryption helpToEncrypt;

    @Autowired
    private Repository customerRepository;

    public RegistrationImp(){ }

    @Override
    public void saveCustomer(Customer customer){

        customerRepository.save(encryptCustomer(customer));
    }

    @Override
    public Customer encryptCustomer(Customer customer){

        customer.setFirstName(helpToEncrypt.encrypt(customer.getFirstName()));
        customer.setLastName(helpToEncrypt.encrypt(customer.getLastName()));
        return  customer;
    }

    @Override
    public Customer decodeCustomer(Customer customer){

        customer.setFirstName(helpToEncrypt.Decode(customer.getFirstName()));
        customer.setLastName(helpToEncrypt.Decode(customer.getLastName()));
        return customer;
    }
}
