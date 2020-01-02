package demo.petclinic.demopetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import demo.petclinic.demopetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}
	
	public T findById(ID id) {
		return map.get(id);
	}
	
	public T save(T obj) {
		if(obj != null) {
			if(obj.getId() == null) {
				obj.setId(getNextId());
			}
			map.put(obj.getId(), obj);
		} else {
			throw new RuntimeException("Object cannot be null.");
		}
		return obj;
	}
	
	public void deleteById(ID id) {
		map.remove(id);
	}
	
	public void delete(T obj) {
		map.entrySet().removeIf(e -> e.getValue().equals(obj));
	}
	
	/*
	 * Get next id based on count of map elements
	 * so that we don't need to set id for each object.
	 */
	private Long getNextId( ) {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch(NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
}
