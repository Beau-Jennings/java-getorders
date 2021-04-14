package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices
{

    @Autowired
    private CustomersRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomersById(long custid) {
        return customerRepository.findById(custid)
        .orElseThrow(() -> new EntityNotFoundException("Customer " + custid + " Not Found!"));
    }

    @Override
    public Customer findCustomerByName(String custname) {
        Customer rtnCustomer = customerRepository.findByCustomerName(custname);
        if (rtnCustomer == null)
        {
            throw new EntityNotFoundException(("Customer " + custname + " Not Found!"));
        }
        return rtnCustomer;
    }
}
