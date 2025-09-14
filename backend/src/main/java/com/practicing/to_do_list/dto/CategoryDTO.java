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

	public CategoryDTO(Long id, String name, String createdAt, String updatedAt) {
		this.id = id;
		this.name = name;
		this.createdAt = Instant.parse(createdAt);
		this.updatedAt = Instant.parse(updatedAt);
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

	public void setCreatedAt(String createdAt) {
		this.createdAt = Instant.parse(createdAt);
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = Instant.parse(updatedAt);
	}
}
