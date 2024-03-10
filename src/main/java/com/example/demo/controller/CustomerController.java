package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.services.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@CrossOrigin(origins = "localhost:3000")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/create")
    public  void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> getCustomerList() {
        return customerService.getAllCustomer();
    }
    @PutMapping("/update")
    public  void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
    @DeleteMapping("/delete/{customerId}")
    public  void deleteCustomer(@PathVariable Long customerId){
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping("/count")
    public long getCustomerCount(){
        return customerService.countCustomer();
    }
}
