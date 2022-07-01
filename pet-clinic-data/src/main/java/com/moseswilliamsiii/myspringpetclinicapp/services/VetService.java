package com.moseswilliamsiii.myspringpetclinicapp.services;

import com.moseswilliamsiii.myspringpetclinicapp.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
