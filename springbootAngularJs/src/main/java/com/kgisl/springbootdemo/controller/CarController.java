package com.kgisl.springbootdemo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kgisl.springbootdemo.entity.Car;
import com.kgisl.springbootdemo.service.CarService;



@RestController
@CrossOrigin("*")
// @CrossOrigin(origins = "http://127.0.0.1:5501")


@RequestMapping("/cars")
public class CarController {
    
    @Autowired
    CarService carService;


 @GetMapping("/allCars")
    public @ResponseBody ResponseEntity<List<Car>> getAll() {
        return new ResponseEntity<>(carService.getAllCars(), HttpStatus.OK);
    }

    // @GetMapping("/allCars")
    // public List<Car> getAll(){
    //     System.out.println(carService.getAllCars());
    //     return carService.getAllCars();
        
    // }

    @PostMapping("/createCar")
    public  Car createCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    // @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Car> getTeamById(@PathVariable("id") long id) {
    //     Car user = carService.getCarById(id);
    //     if (user == null) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    //     return new ResponseEntity<>(user, HttpStatus.OK);
    // }


    @GetMapping("/get/{id}")
    public Optional<Car> getCarById(@PathVariable("id") Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/update/{id}")
    public Car updateCar(@PathVariable("id") Integer id, @RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }

}
