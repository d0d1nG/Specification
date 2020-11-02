package models;

import java.util.HashMap;
import java.util.Map;

public class Entity {
	private String id;
	private String name;
	
	private Map<String, Object> properties = new HashMap<String, Object>();
	private Map<String, Entity> entities = new HashMap<String, Entity>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Object> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	public Map<String, Entity> getEntities() {
		return entities;
	}
	public void setEntities(Map<String, Entity> entities) {
		this.entities = entities;
	}
	@Override
	public String toString() {
		return  id + name + properties.toString() + entities.toString() ;
	}
	
	
}
