package com.moseswilliamsiii.myspringpetclinicapp.services;


import com.moseswilliamsiii.myspringpetclinicapp.model.Pet;

import java.util.Set;

public interface PetService {

    Pet finbById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
