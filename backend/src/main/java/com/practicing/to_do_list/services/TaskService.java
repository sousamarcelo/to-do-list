package com.practicing.to_do_list.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicing.to_do_list.dto.TaskDTO;
import com.practicing.to_do_list.entities.Task;
import com.practicing.to_do_list.repositories.TaskRepository;
import com.practicing.to_do_list.services.exceptions.ResourceNotFoundException;



@Service
public class TaskService {
	
	@Autowired
	private  TaskRepository repository;
	
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

}
