package com.practicing.to_do_list.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicing.to_do_list.dto.TaskDTO;
import com.practicing.to_do_list.services.TaskService;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {
	
	@Autowired
	private TaskService service;
	
	@GetMapping
	public ResponseEntity<Page<TaskDTO>> findAll(Pageable pageable){
		Page<TaskDTO> restul = service.findAllPaged(pageable);
		return ResponseEntity.ok().body(restul);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TaskDTO> findById(@PathVariable Long id){
		TaskDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
