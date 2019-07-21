package com.rak.dao;

import org.springframework.stereotype.Repository;

import com.rak.model.Person;

@Repository("personDao")
public class PersonDAOImp extends AbstractDAO implements PersonDAO
{

    @Override
    public void savePerson(Person person)
    {
        presist(person);

    }

}
