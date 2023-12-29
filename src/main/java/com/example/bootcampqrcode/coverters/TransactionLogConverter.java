package com.example.bootcampqrcode.coverters;

import com.example.bootcampqrcode.models.dtoes.TransactionLogDto;
import com.example.bootcampqrcode.models.entities.TransactionLogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionLogConverter extends BaseConverter<TransactionLogEntity, TransactionLogDto>{
    @Override
    @Mapping(source = "qrCodeId" , target = "qrCode.id")
    @Mapping(source = "versionQr" , target = "qrCode.version")
    TransactionLogEntity convertEntity(TransactionLogDto model);

    @Override
    @Mapping(source = "qrCode.id" , target = "qrCodeId")
    @Mapping(source = "qrCode.version" , target = "versionQr")
    TransactionLogDto convertDto(TransactionLogEntity model);
}
