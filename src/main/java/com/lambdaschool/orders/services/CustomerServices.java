package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;

import java.util.List;

public interface CustomerServices
{
    List<Customer> findAllCustomers();

    Customer save(Customer customer);

    Customer findCustomersById(long custid);

    List<Customer> findByCustName(String custname);
}
