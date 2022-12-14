package com.brandoo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* Generated by Springboot-3layer-Generator at Nov 7, 2022, 9:05:57 AM
*/
public interface CrudService<E,P> {

    E create(E entity);

    E update(E entity);

    Page<E> read(E entity, Pageable pageable);
    E readOne(P primaryKey);

    void delete(P primaryKey);

}