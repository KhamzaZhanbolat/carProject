package com.example.CarProject.service.impl;

import com.example.CarProject.dto.CarDto;
import com.example.CarProject.mapper.CarMapper;
import com.example.CarProject.repository.CarRepository;
import com.example.CarProject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public List<CarDto> getAllCars() {
        return carMapper.toDtoList(carRepository.findAll());
    }

    @Override
    public CarDto getById(Long id) {
        return carMapper.toDto(carRepository.findById(id).orElse(null));
    }

    @Override
    public CarDto create(CarDto carDto) {
        return null;
    }

    @Override
    public CarDto update(CarDto carDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
