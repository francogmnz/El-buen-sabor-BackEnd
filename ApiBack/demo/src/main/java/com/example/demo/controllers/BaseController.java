package com.example.demo.controllers;

import com.example.demo.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public interface BaseController<E extends Base, ID extends Serializable> {

    @GetMapping("") //el ? significa que le pasamos como un comodin de un objeto
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Pageable pageable);
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable ID id);
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity);

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable ID id);
}
