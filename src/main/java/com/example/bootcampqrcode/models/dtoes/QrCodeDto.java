package com.example.bootcampqrcode.models.dtoes;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QrCodeDto{

    private Long walletId;
    private String phoneNumber;
}
