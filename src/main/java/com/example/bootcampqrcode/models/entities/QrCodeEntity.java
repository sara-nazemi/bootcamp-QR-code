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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "WALLET_ID")
    private Long walletId;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "USAGE_COUNT")
    private Long usageCount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "qrCode", cascade = CascadeType.MERGE)
    private List<TransactionLogEntity> transactionLogs;
}
