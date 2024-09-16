package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Payment;
import com.lambdaschool.orders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class PaymentServicesImpl implements PaymentServices
{
    @Autowired
    private PaymentsRepository paymentsRepository;

    @Transactional
    @Override
    public Payment save(Payment payment)
    {
        return paymentsRepository.save(payment);
    }
}
