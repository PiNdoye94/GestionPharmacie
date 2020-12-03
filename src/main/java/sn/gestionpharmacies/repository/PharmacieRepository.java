package sn.gestionpharmacies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.gestionpharmacies.entitie.Pharmacie;

import java.util.List;

@RepositoryRestResource
public interface PharmacieRepository extends JpaRepository<Pharmacie, Long> {

//    List<Pharmacie> findByNomPharmacie(String nom);
//    List<Pharmacie> findByNomPharmacieContains(String nom);
}
