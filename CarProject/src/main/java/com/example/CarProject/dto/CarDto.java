package com.example.CarProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Long id;

    private String brand;

    private String model;

    private int year;

    private double price;

    private String color;

    private String engine;
}
