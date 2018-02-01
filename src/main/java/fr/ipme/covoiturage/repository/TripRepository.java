package fr.ipme.covoiturage.repository;

import fr.ipme.covoiturage.modeles.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository <Trip,Integer> {
}
