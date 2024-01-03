package com.example.bootcampqrcode.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseService <E,R extends JpaRepository<E,Long>>{

}
