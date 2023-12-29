package com.example.bootcampqrcode.repositories;

import com.example.bootcampqrcode.models.documents.ExceptionDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExceptionRepository extends MongoRepository<ExceptionDocument,String> {
}
