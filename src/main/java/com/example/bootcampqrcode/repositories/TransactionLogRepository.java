package com.example.bootcampqrcode.repositories;

import com.example.bootcampqrcode.models.entities.TransactionLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLogRepository extends JpaRepository<TransactionLogEntity,Long> {
}
