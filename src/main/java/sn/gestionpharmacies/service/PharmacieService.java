package sn.gestionpharmacies.service;

import sn.gestionpharmacies.entitie.Pharmacie;

import java.util.List;

public interface PharmacieService {

    Pharmacie savePharmacie(Pharmacie p);
    Pharmacie updatePharmacie(Pharmacie p);
    void deletePharmacie(Pharmacie p);
    void deletePharmacieById(Long id);
    Pharmacie getPharmacie(Long id);
    List<Pharmacie> getAllPharmacies();
//    List<Pharmacie> findByNomPharmacie(String nom);
//    List<Pharmacie> findByNomPharmacieContains(String nom);

}
