package com.moseswilliamsiii.myspringpetclinicapp.services;

import com.moseswilliamsiii.myspringpetclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
