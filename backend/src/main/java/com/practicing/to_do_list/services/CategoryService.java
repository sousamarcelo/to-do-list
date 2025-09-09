package com.practicing.to_do_list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicing.to_do_list.dto.CategoryDTO;
import com.practicing.to_do_list.entities.Category;
import com.practicing.to_do_list.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	
	@Transactional(readOnly = true)
	public Page<CategoryDTO> findAllPaged(Pageable pageable){
		Page<Category> list = repository.findAll(pageable);
		Page<CategoryDTO> listDTO = list.map(x -> new CategoryDTO(x));
		return listDTO;
	}
}
