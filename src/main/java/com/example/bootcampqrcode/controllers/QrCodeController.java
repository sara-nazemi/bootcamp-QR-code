package com.example.bootcampqrcode.controllers;

import com.example.bootcampqrcode.models.dtoes.QrCodeDto;
import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
@Transactional(readOnly = true)
public class QrCodeController extends BaseController<QrCodeEntity, QrCodeDto,Long>{
}
