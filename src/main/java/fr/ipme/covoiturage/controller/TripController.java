package fr.ipme.covoiturage.controller;

import fr.ipme.covoiturage.modeles.Trip;
import fr.ipme.covoiturage.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private TripRepository repository;

    @GetMapping
    public List<Trip> list(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Trip get(@PathVariable int id){
        return repository.getOne(id);
    }

    @PostMapping
    public Trip create(@RequestBody Trip trip){
        Trip createdTrip = repository.save(trip);
        return createdTrip;
    }

    @PutMapping("/{id}")
    public Trip update(@PathVariable int id, @RequestBody Trip trip){
        Trip savedTrip = repository.getOne(id);
        if(savedTrip != null){
            trip.setId(savedTrip.getId());
            savedTrip = repository.save(trip);
        }

        return savedTrip;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }

//    delete
}
