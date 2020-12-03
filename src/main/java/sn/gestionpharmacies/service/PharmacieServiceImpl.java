package sn.gestionpharmacies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gestionpharmacies.entitie.Pharmacie;
import sn.gestionpharmacies.repository.PharmacieRepository;

import java.util.List;
import java.util.stream.Stream;

@Service
public class PharmacieServiceImpl implements PharmacieService{

    @Autowired
    private PharmacieRepository pharmacieRepository;

    @Override
    public Pharmacie savePharmacie(Pharmacie p) {
        return pharmacieRepository.save(p);
    }

    @Override
    public Pharmacie updatePharmacie(Pharmacie p) {
        return pharmacieRepository.save(p);
    }

    @Override
    public void deletePharmacie(Pharmacie p) {
        pharmacieRepository.delete(p);
    }

    @Override
    public void deletePharmacieById(Long id) {
        pharmacieRepository.deleteById(id);
    }

    @Override
    public Pharmacie getPharmacie(Long id) {
        return pharmacieRepository.findById(id).get();
    }

    @Override
    public List<Pharmacie> getAllPharmacies() {
        return pharmacieRepository.findAll();
    }

//    @Override
//    public List<Pharmacie> findByNomPharmacie(String nom) {
//        return pharmacieRepository.findByNomPharmacie(nom);
//    }
//
//    @Override
//    public List<Pharmacie> findByNomPharmacieContains(String nom) {
//        return pharmacieRepository.findByNomPharmacieContains(nom);
//    }
}
