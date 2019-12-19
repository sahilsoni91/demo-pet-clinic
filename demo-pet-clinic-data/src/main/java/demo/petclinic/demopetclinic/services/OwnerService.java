package demo.petclinic.demopetclinic.services;

import java.util.Set;

import demo.petclinic.demopetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();	
}
