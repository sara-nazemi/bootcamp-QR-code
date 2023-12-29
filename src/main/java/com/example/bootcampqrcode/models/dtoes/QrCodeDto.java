package com.example.bootcampqrcode.models.dtoes;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QrCodeDto extends BaseDto{
    private Long id;
    private Long walletId;
    private Date createDate;
    private Boolean status;
    private Long usageCount;
}
