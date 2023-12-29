package com.example.bootcampqrcode.sampleRespose;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class QrResponse<T>{
    private String message;
    private String code;
    private Date date;
    private Boolean hasError;
    private T data;
}
