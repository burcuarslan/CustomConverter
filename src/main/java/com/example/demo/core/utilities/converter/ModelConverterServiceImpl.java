package com.example.demo.core.utilities.converter;

import com.example.demo.core.utilities.mappers.ModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelConverterServiceImpl implements ModelConverterService{

    private ModelMapperService modelMapperService;

    @Autowired
    public ModelConverterServiceImpl(ModelMapperService modelMapperService) {
        this.modelMapperService = modelMapperService;
    }

    @Override
    public <T> T convertResponse(Object source, Class<T> targetClass) {
        return modelMapperService.forResponse().map(source, targetClass);
    }

    @Override
    public <T> T convertRequest(Object source, Class<T> targetClass) {
        return modelMapperService.forRequest().map(source, targetClass);
    }

    @Override
    public <T> List<T> convertResponse(List<?> sourceList, Class<T> targetClass) {
        return sourceList.stream().map(source -> modelMapperService.forResponse().map(source, targetClass)).toList();
    }

    @Override
    public <T> List<T> convertRequest(List<?> sourceList, Class<T> targetClass) {
        return sourceList.stream().map(source -> modelMapperService.forRequest().map(source, targetClass)).toList();
    }
}
