package com.rak.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rak.dao.PersonDAO;
import com.rak.model.Person;

@Service("personService")
@Transactional
public class PersonServiceImp implements PersonService
{
    @Autowired
    private PersonDAO dao;

    @Override
    public void savePerson(Person person)
    {
        dao.savePerson(person);

    }

    public PersonDAO getDao()
    {
        return dao;
    }

    public void setDao(PersonDAO dao)
    {
        this.dao = dao;
    }

}
