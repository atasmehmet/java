package com.example.demo.services.abstracts;

import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomerService {
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomerById(long id);
    void getCustomerById(long id);
    List<Customer> getAllCustomer();
    long countCustomer();
}
