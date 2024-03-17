package com.example.demo.core.utilities.converter;

import java.util.List;

public interface ModelConverterService {

        <T> T convertResponse(Object source, Class<T> targetClass);

        <T> T convertRequest(Object source, Class<T> targetClass);

        <T> List<T> convertResponse(List<?> sourceList, Class<T> targetClass);

        <T> List<T> convertRequest(List<?> sourceList, Class<T> targetClass);

}
