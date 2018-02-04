package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//This interface is implemented by Spring Data REST at run time and will autogenerate RESTful endpoints
//to manipulate our People resource
@RepositoryRestResource(collectionResourceRel = "patient", path= "patient")
public interface PatientRepository extends MongoRepository<Patient, String>{

	List<Patient> findByLastName(@Param("name") String name);
}
