package sn.gestionpharmacies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.gestionpharmacies.entitie.Pharmacie;
import sn.gestionpharmacies.repository.PharmacieRepository;

import java.util.stream.Stream;
@SpringBootApplication
public class GestionpharmaciesApplication implements CommandLineRunner {
    @Autowired
    private PharmacieRepository pharmacieRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionpharmaciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        pharmacieRepository.save(new Pharmacie(1, "Parcelle", "PA", "Guediawaye", true));
//        pharmacieRepository.save(new Pharmacie(2, "Guigon", "Plateau", "Dakar", false));
//        pharmacieRepository.save(new Pharmacie(3, "Pharma", "soprime", "Pate d'oie", false));
//
//        pharmacieRepository.findAll().forEach(p->{
//            System.out.println(p.toString());
//        });
    }

}
