package demo.petclinic.demopetclinic.services;

import demo.petclinic.demopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
