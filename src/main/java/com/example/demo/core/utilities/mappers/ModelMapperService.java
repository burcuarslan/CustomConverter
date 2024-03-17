package com.example.demo.core.utilities.mappers;

import org.modelmapper.ModelMapper;

import java.util.List;

public interface ModelMapperService {

    ModelMapper forResponse();

    ModelMapper forRequest();

}
