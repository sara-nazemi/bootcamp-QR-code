package com.example.bootcampqrcode.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class BaseServiceImpl<E, R extends JpaRepository<E, Long>> implements BaseService<E, R> {
    @Autowired
    protected R repository;
}
