package com.example.springdatarest.Controller;

import com.example.springdatarest.Modele.Voiture;
import com.example.springdatarest.Repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voitures") // Base URL for voiture endpoints
public class VoitureController {

    @Autowired
    private VoitureRepo voitureRepo;

    // Get all voitures
    @GetMapping
    public List<Voiture> getAllVoitures() {
        return (List<Voiture>) voitureRepo.findAll();
    }

    // Add a new voiture
    @PostMapping("/add")
    public ResponseEntity<Voiture> addVoiture(@RequestBody Voiture voiture) {
        System.out.println("Voiture reçue : " + voiture);
        return ResponseEntity.ok(voitureRepo.save(voiture));
    }

    // Delete a voiture by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVoiture(@PathVariable Long id) {
        voitureRepo.deleteById(id);
        return ResponseEntity.noContent().build(); // Return 204 No Content on successful deletion
    }
}
