package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.services.AgentService;
import com.lambdaschool.javaorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired CustomerService customerService;

    @Autowired AgentService agentService;


// http://localhost:2019/customers/orders
// http://localhost:2019/customers/customer/7
// http://localhost:2019/customers/customer/77
// http://localhost:2019/customers/namelike/mes
// http://localhost:2019/customers/namelike/cin
}
