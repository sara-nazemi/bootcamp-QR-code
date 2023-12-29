package com.example.bootcampqrcode.exceptions;

public class QrException extends RuntimeException{
    public QrException() {
    }

    public QrException(String message) {
        super(message);
    }

    public QrException(String message, Throwable cause) {
        super(message, cause);
    }

    public QrException(Throwable cause) {
        super(cause);
    }

    public QrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
