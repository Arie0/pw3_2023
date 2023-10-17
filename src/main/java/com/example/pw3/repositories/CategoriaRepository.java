package com.example.pw3.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pw3.models.Categoria;

@Repository
public interface CategoriaRepository extends AbstractRepository<Categoria, Long> {

    // @Query(value = "select * from categoria where id = 1", nativeQuery = true)
    // public Collection<Categoria> findAllQuery();
}
