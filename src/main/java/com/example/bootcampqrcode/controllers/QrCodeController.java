package com.example.bootcampqrcode.controllers;

import com.example.bootcampqrcode.models.dtoes.QrCodeDto;
import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import com.example.bootcampqrcode.sampleRespose.QrResponse;
import com.example.bootcampqrcode.services.QrCodeService;
import com.google.zxing.WriterException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/qrcode")
@Transactional(readOnly = true)
public class QrCodeController extends BaseController<QrCodeEntity, QrCodeDto, QrCodeService> {
    @GetMapping("/read/{phoneNumber}")
    public void QRCodeRead(@PathVariable String phoneNumber) {
        String qrCodeFilePath = "F:\\class mapsa\\bootcamp-QR-code\\src\\main\\java\\com\\example\\bootcampqrcode\\services\\QR" + phoneNumber;

        File qrCodeFile = new File(qrCodeFilePath);
         QrCodeService.readQRCode(qrCodeFile);



    }


    @PostMapping("/create")
    public  void creat(@RequestBody QrCodeDto qrCodeDto) throws IOException, WriterException {

        QrCodeService.generateQRCode(qrCodeDto);

        

        }


      


    }





