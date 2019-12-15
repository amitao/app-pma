package com.amie.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.amie.pma.entities.Project;

// CRUD repository to insert, query, and delete data in the database
public interface ProjectRepository extends CrudRepository<Project, Long> {

}
