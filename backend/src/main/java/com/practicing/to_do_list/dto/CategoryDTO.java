package com.practicing.to_do_list.dto;

import java.time.Instant;

import com.practicing.to_do_list.entities.Category;

public class CategoryDTO {
	
	private Long id;
	private String name;	
	private Instant createdAt;	
	private Instant updatedAt;
	
	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Long id, String name, Instant createdAt, Instant updatedAt) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public CategoryDTO(Category entity) {
		id = entity.getId();
		name = entity.getName();
		createdAt = entity.getCreatedAt();
		updatedAt = entity.getUpdatedAt();
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
}
