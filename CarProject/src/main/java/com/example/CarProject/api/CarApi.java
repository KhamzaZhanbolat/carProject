package com.example.CarProject.api;

import com.example.CarProject.dto.CarDto;
import com.example.CarProject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/car")
@RequiredArgsConstructor
public class CarApi {

    private final CarService carService;

    @GetMapping("/")
    public List<CarDto> getAll() {
        return carService.getAllCars();
    }
    @GetMapping("/{id}")
    public CarDto getById(@PathVariable Long id) {
        return carService.getById(id);
    }


}
