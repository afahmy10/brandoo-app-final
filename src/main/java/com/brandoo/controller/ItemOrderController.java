package com.brandoo.controller;

import com.brandoo.model.ItemOrder;
import com.brandoo.service.ItemOrderService;

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
@RequestMapping("/itemorder/")
public class ItemOrderController implements CrudController<ItemOrder,java.lang.Integer>{

    @Autowired
    private ItemOrderService service;

    @Override
    public ResponseEntity<ItemOrder> create(@RequestBody ItemOrder entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<ItemOrder> update(@RequestBody ItemOrder entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<ItemOrder>> read(
            @RequestBody ItemOrder entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<ItemOrder> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}