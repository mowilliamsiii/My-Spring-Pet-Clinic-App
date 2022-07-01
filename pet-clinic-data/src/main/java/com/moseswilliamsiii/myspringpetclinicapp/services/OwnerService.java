package com.moseswilliamsiii.myspringpetclinicapp.services;

import com.moseswilliamsiii.myspringpetclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner finbById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
