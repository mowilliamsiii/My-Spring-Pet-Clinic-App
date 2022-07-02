package com.moseswilliamsiii.myspringpetclinicapp.services.map;

import com.moseswilliamsiii.myspringpetclinicapp.model.Owner;
import com.moseswilliamsiii.myspringpetclinicapp.services.CrudService;

import java.util.Set;

public class OnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
