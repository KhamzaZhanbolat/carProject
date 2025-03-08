package com.example.CarProject.mapper;

import com.example.CarProject.dto.CarDto;
import com.example.CarProject.model.CarEntity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto toDto(CarEntity carEntity);

    CarEntity toEntity(CarDto carDto);

    List<CarDto> toDtoList(List<CarEntity> carEntityList);
}
