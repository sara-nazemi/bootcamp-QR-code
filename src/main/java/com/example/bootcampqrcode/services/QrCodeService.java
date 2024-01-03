package com.example.bootcampqrcode.services;

import com.example.bootcampqrcode.models.dtoes.QrCodeDto;
import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import com.example.bootcampqrcode.repositories.QrCodeRepository;
import com.example.bootcampqrcode.sampleRespose.QrResponse;
import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.spring.boot.client.BufferedImageLuminanceSource;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class QrCodeService extends BaseServiceImpl<QrCodeEntity, QrCodeRepository> {

    private static final Logger LOGGER =  LoggerFactory.getLogger(QrCodeService.class);
    private static final String QRPATH="F:\\class mapsa\\bootcamp-QR-code\\src\\main\\java\\com\\example\\bootcampqrcode\\services\\QR\\";

    public static void generateQRCode(QrCodeDto qrCodeDto) throws WriterException, IOException {
        String qrCodePath = QRPATH;
        String qrCodeName = qrCodePath + qrCodeDto.getPhoneNumber() + qrCodeDto.getWalletId() + "-QRCODE.png";
        var qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(

                "phoneNumber:" + qrCodeDto.getPhoneNumber()
                        + "\n" +
                        "walletID" + qrCodeDto.getWalletId() + "\n"
                , BarcodeFormat.QR_CODE, 400, 400);
        Path path = FileSystems.getDefault().getPath(qrCodeName);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);





    }

    public static String readQRCode(File qrCodeFile){
        try {
            BufferedImage bufferedImage= ImageIO.read(qrCodeFile);
            BufferedImageLuminanceSource bufferedImageLuminanceSource=new BufferedImageLuminanceSource(bufferedImage);
            HybridBinarizer hybridBinarizer=new HybridBinarizer(bufferedImageLuminanceSource);
            BinaryBitmap binaryBitmap=new BinaryBitmap(hybridBinarizer);
            MultiFormatReader multiFormatReader=new MultiFormatReader();

            Result result=multiFormatReader.decode(binaryBitmap);
            String qrCodeText=result.getText();
            return qrCodeText;
        }
        catch (IOException| NotFoundException ex) {
            LOGGER.error("error during reading QR code image", ex);
        }
        return  null;



    }
}
