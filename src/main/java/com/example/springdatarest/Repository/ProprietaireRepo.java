package com.example.springdatarest.Repository;


import com.example.springdatarest.Modele.Proprietaire;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
@Repository

public interface ProprietaireRepo extends CrudRepository<Proprietaire, Integer> {

}