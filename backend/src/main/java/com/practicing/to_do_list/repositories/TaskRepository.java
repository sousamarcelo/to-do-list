package com.practicing.to_do_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicing.to_do_list.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
