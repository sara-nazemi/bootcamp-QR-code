package com.example.bootcampqrcode.services;

import com.example.bootcampqrcode.models.entities.TransactionLogEntity;
import com.example.bootcampqrcode.repositories.TransactionLogRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionLogService extends BaseServiceImpl<TransactionLogEntity, TransactionLogRepository> {
}
