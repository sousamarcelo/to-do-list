package com.practicing.to_do_list.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.practicing.to_do_list.entities.Category;
import com.practicing.to_do_list.entities.Task;
import com.practicing.to_do_list.enums.TaskStatusEnum;

public class TaskDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String description;
	private TaskStatusEnum status;
	private Instant createdAt;
	private Instant updateAt;
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public TaskDTO() {
	}

	public TaskDTO(Long id, String title, String description, String status, String createdAt, String updateAt) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = TaskStatusEnum.valueOf(status);
		this.createdAt = Instant.parse(createdAt);
		this.updateAt = Instant.parse(updateAt);
	}
	
	public TaskDTO(Task entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.description = entity.getDescription();
		this.status = entity.getStatus();
		this.createdAt = entity.getCreatedAt();
		this.updateAt = entity.getUpdateAt();
	}
	
	public TaskDTO(Task entity, Set<Category> cateogires) {
		this(entity);
		cateogires.forEach(x -> this.categories.add(new CategoryDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TaskStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TaskStatusEnum status) {
		this.status = status;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Instant updateAt) {
		this.updateAt = updateAt;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
}
