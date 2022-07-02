package com.moseswilliamsiii.myspringpetclinicapp.services.map;

import com.moseswilliamsiii.myspringpetclinicapp.model.Pet;
import com.moseswilliamsiii.myspringpetclinicapp.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteByObject(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
