package com.example.demo.repository;

import com.example.demo.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Repository extends CrudRepository<Customer, Long>{

    List<Customer> findAll();
}







