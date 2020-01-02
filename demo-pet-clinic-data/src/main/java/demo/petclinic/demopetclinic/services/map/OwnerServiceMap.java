package demo.petclinic.demopetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.petclinic.demopetclinic.model.Owner;
import demo.petclinic.demopetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner obj) {
		super.delete(obj);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
