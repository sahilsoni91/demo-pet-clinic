package demo.petclinic.demopetclinic.services.map;

import java.util.Set;

import demo.petclinic.demopetclinic.model.Pet;
import demo.petclinic.demopetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet obj) {
		super.delete(obj);
	}

}
