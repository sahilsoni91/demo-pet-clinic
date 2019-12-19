package demo.petclinic.demopetclinic.services;

import java.util.Set;

import demo.petclinic.demopetclinic.model.Pet;


public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
