package com.example.FristApi05.controller;


import com.example.FristApi05.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "")
    public CarDTO getCar(){
        return new CarDTO("5478", "Audi Q8",8750.99);
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    public String postCar(@Valid @RequestBody(required = false) CarDTO car){
        return car.toString();
    }
}
