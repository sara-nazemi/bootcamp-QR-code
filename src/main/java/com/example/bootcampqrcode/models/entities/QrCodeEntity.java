package com.example.bootcampqrcode.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "QR_CODE")
public class QrCodeEntity extends BaseEntity {
    private Long walletId;

    private Date createDate;

    private Boolean status;

    private Long usageCount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "qrCode", cascade = CascadeType.MERGE)
    private List<TransactionLogEntity> transactionLogs;
}
