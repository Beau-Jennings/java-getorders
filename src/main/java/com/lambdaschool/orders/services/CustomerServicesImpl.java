package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices
{

    @Autowired
    private CustomersRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() 
    {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    
    @Override
    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomersById(long id) throws
            EntityNotFoundException
    {
        return customerRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not Found!"));
    }

    @Override
    public List<Customer> findByCustName(String custname)
    {
        return customerRepository.findByCustName(custname);
    }
}
