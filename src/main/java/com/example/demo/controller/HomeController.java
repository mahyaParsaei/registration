package com.example.demo.controller;

import com.example.demo.domain.Customer;
import com.example.demo.repository.Repository;
import com.example.demo.service.RegistrationImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    private RegistrationImp registration;

    @Autowired
    private Repository customerRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("customers", customerRepository.findAll());
        return "home";
    }

    
    @GetMapping("/newCustomer")
    public String newCustomer(Customer customer) {
        return "add-customer";
    }

    
    @PostMapping("/addCustomer")
    public String addUser(@Validated Customer customer, BindingResult result,
                          Model model) {
        
        if (result.hasErrors()) {
            return "add-customer";
        }

        //registration.saveCustomer(customer);
        return "redirect:/";
    }

}
