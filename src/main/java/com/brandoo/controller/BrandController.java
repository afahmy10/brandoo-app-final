package com.brandoo.controller;

import com.brandoo.model.Brand;
import com.brandoo.service.BrandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at Nov 7, 2022, 9:05:57 AM
*/
@RestController
@RequestMapping("/brand/")
public class BrandController implements CrudController<Brand,java.lang.Integer>{

    @Autowired
    private BrandService service;

    @Override
    public ResponseEntity<Brand> create(@RequestBody Brand entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<Brand> update(@RequestBody Brand entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<Brand>> read(
            @RequestBody Brand entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<Brand> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}