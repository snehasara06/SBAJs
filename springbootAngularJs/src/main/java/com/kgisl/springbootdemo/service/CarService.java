package com.kgisl.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springbootdemo.entity.Car;
import com.kgisl.springbootdemo.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    // GET
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    // POST
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    // GET BY ID
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    // PUT
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    // DELETE
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

}
// public Optional<Car>getCarByName(String name);
