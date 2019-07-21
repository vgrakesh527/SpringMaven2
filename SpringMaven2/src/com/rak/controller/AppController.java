package com.rak.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rak.model.Person;
import com.rak.service.PersonService;

@Controller
@RequestMapping("/")
@ComponentScan("com.rak")
public class AppController
{
    @Autowired
    PersonService service;

    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String savePerson(@Valid Person person, BindingResult result, ModelMap model)
    {
        if (result.hasErrors()) {
            return "registration";
        }
        service.savePerson(person);
        model.addAttribute("success", "Person" + person.getName() + " Save Successfully");
        return "success";
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String newPerson(ModelMap model)
    {
        Person person = new Person();
        model.addAttribute("person", person);
        return "registration";
    }
}
