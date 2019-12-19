package demo.petclinic.demopetclinic.services;

import java.util.Set;

import demo.petclinic.demopetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet pet);

	Set<Vet> findAll();
}
