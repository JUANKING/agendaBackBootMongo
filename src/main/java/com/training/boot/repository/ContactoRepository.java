package com.training.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.training.boot.domain.Contacto;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "contactos", path = "contactos")
public interface ContactoRepository extends MongoRepository<Contacto, String>  {

}
