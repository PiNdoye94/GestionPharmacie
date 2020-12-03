package sn.gestionpharmacies.entitie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
public class Pharmacie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false, length=200)
    private String nom;
    @Column(nullable=false, length=200)
    private String quartier;
    @Column(nullable=false, length=200)
    private String ville;
    private boolean etat;

    public Pharmacie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public Pharmacie(String nom, String quartier, String ville, boolean etat) {
        this.nom = nom;
        this.quartier = quartier;
        this.ville = ville;
        this.etat = etat;
    }
}
