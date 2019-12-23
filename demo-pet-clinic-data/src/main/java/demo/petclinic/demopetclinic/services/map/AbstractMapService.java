package demo.petclinic.demopetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();
	
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}
	
	public T findById(ID id) {
		return map.get(id);
	}
	
	public T save(ID id, T obj) {
		map.put(id, obj);
		return obj;
	}
	
	public void deleteById(ID id) {
		map.remove(id);
	}
	
	public void delete(T obj) {
		map.entrySet().removeIf(e -> e.getValue().equals(obj));
	}
}
