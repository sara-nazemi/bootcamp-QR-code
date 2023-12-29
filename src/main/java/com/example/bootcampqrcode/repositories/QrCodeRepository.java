package com.example.bootcampqrcode.repositories;

import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QrCodeRepository extends JpaRepository<QrCodeEntity,Long> {
}
