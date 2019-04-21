package com.arghya.tool.springbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arghya.tool.springbackend.domain.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	@Override
    Iterable<Project> findAllById(Iterable<Long> arg0);

	
	
}
