package com.example.bootcampqrcode.controllers;

import com.example.bootcampqrcode.coverters.BaseConverter;
import com.example.bootcampqrcode.models.entities.BaseEntity;
import com.example.bootcampqrcode.services.BaseService;
import com.example.bootcampqrcode.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseController<E extends BaseEntity,D,S extends BaseServiceImpl<E,?extends JpaRepository<E,Long>>> {
    @Autowired
    private S service;
    @Autowired
    private BaseConverter<E,D> converter;
}
