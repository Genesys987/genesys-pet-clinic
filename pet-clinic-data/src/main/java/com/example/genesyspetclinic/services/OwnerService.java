package com.example.genesyspetclinic.services;

import com.example.genesyspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
