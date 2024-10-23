package com.example.springdatarest.Repository;

import com.example.springdatarest.Modele.Voiture;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

@RepositoryRestResource
public interface VoitureRepo extends CrudRepository<Voiture, Long>{
    //Lister Voitures par marque
    List<Voiture> findByModele(@Param("modele") String modele);
//Lister Voitures par couleur

    List<Voiture> findByCouleur(@Param("couleur") String couleur);
}
