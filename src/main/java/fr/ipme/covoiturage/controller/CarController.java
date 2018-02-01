package fr.ipme.covoiturage.controller;

import fr.ipme.covoiturage.modeles.Car;
import fr.ipme.covoiturage.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> list(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Car get(@PathVariable int id){
        return repository.getOne(id);
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        Car createdCity = repository.save(car);
        return createdCity;
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable int id, @RequestBody Car car){
        Car savedCar = repository.getOne(id);
        if(savedCar != null){
            car.setId(savedCar.getId());
            savedCar = repository.save(car);
        }

        return savedCar;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }

//    delete
}
