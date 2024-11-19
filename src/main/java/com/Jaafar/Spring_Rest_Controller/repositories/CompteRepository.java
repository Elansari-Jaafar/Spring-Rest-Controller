package com.Jaafar.Spring_Rest_Controller.repositories;

import org.springframework.stereotype.Repository;
import com.Jaafar.Spring_Rest_Controller.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
