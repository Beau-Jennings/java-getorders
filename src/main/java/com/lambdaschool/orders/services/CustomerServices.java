package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;

import java.util.List;

public interface CustomerServices
{
    List<Customer> findAllCustomers();

    static Customer findCustomerByName(String custname);

    Customer save(Customer customer);

    Customer findCustomersById(long custid);
}
