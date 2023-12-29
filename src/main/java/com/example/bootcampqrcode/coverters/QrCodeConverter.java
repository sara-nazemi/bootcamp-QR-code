package com.example.bootcampqrcode.coverters;

import com.example.bootcampqrcode.models.dtoes.QrCodeDto;
import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QrCodeConverter extends BaseConverter<QrCodeEntity, QrCodeDto>{
}
