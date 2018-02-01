package fr.ipme.covoiturage.repository;

import fr.ipme.covoiturage.modeles.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
}
