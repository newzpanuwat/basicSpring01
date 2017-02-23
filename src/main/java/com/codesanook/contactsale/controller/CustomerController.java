package com.codesanook.contactsale.controller;

import com.codesanook.contactsale.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {


    //customer/create
    @RequestMapping(value = "/customer/create",method = RequestMethod.GET)
    public String create(Model model){

        Customer customer = new Customer();
        model.addAttribute("customer",customer);


        return "customer-create";
    }
    @RequestMapping(value = "/customer/create",method = RequestMethod.POST)
    public String create(Customer customer,Model model){
        model.addAttribute("customer",customer);
        return "customer-create";
    }
}
