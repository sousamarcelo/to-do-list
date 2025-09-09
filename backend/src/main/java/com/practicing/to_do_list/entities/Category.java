package com.practicing.to_do_list.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
		
	private Long id;
	private String name;
	private Instant createdAt;
	private Instant updatedAt;
	
	public Category() {
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
		this.createdAt = Instant.now();
		this.updatedAt = null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
}
