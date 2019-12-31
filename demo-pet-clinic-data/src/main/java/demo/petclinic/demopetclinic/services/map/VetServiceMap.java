package demo.petclinic.demopetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.petclinic.demopetclinic.model.Vet;
import demo.petclinic.demopetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet obj) {
		super.delete(obj);
	}
}
