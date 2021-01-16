package com.mbugajski.spring5petclinic.services;

import com.mbugajski.spring5petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
