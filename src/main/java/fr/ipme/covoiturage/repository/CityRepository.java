package fr.ipme.covoiturage.repository;

import fr.ipme.covoiturage.modeles.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City,Integer> {
}
