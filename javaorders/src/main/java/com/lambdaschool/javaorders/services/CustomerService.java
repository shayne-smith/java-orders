package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.models.Order;

import java.util.List;

public interface CustomerService {

    List<Customer> findAllCustomerOrders();

    Customer findCustomerById(long id);

    List<Customer> findCustomerByLikeName(String thename);

}
