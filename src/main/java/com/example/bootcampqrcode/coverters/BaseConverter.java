package com.example.bootcampqrcode.coverters;

import org.mapstruct.Mapping;

import java.util.List;

public interface BaseConverter<E,D> {

    E convertEntity(D model);


    D convertDto(E model);

    List<E> converterEntities(List<D> models);

    List<D> converterDtoes(List<E> models);
}
