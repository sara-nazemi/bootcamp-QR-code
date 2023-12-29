package com.example.bootcampqrcode.models.dtoes;

import com.example.bootcampqrcode.models.entities.QrCodeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionLogDto extends BaseDto{
    private Long id;
    private Long amount;
    private Date dateId;
    private Long qrCodeId;
    private Integer versionQr;
}
