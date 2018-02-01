package fr.ipme.covoiturage.repository;

import fr.ipme.covoiturage.modeles.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer>{
}
