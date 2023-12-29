package com.example.bootcampqrcode.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TRANSACTION_LOG")
public class TransactionLogEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "DATE_ID")
    private Date dateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QR_CODE_ID", nullable = false)
    private QrCodeEntity qrCode;
}
