package com.practicing.to_do_list.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicing.to_do_list.dto.CategoryDTO;
import com.practicing.to_do_list.dto.TaskDTO;
import com.practicing.to_do_list.entities.Category;
import com.practicing.to_do_list.entities.Task;
import com.practicing.to_do_list.repositories.CategoryRepository;
import com.practicing.to_do_list.repositories.TaskRepository;
import com.practicing.to_do_list.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;



@Service
public class TaskService {
	
	@Autowired
	private  TaskRepository repository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional(readOnly = true)
	public Page<TaskDTO> findAllPaged(Pageable pageable){
		Page<Task> result = repository.findAll(pageable);
		Page<TaskDTO> resultDTO = result.map(x -> new TaskDTO(x, x.getCategories()));
		return resultDTO;
	}
	
	@Transactional(readOnly = true)
	public TaskDTO findById(Long id) {
		Optional<Task> result = repository.findById(id);
		Task entity = result.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new TaskDTO(entity, entity.getCategories());
	}
	
	@Transactional
	public TaskDTO insert(TaskDTO dto) {
		Task entity = new Task();
		copyDTOToEntoty(dto, entity);
		entity = repository.save(entity);
		return new TaskDTO(entity);
	}
	
	@Transactional
	public TaskDTO update(Long id, TaskDTO dto) {
		try {
		Task entity = repository.getReferenceById(id);
		copyDTOToEntoty(dto, entity);
		entity = repository.save(entity);
		return new TaskDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	private void copyDTOToEntoty(TaskDTO dto, Task entity) {
		entity.setTitle(dto.getTitle());
		entity.setDescription(dto.getDescription());
		entity.setStatus(dto.getStatus());
		
		entity.getCategories().clear();
		for(CategoryDTO taskDto : dto.getCategories()) {
			Category category = categoryRepository.getReferenceById(taskDto.getId());
			entity.getCategories().add(category);
		}		
	}

}
