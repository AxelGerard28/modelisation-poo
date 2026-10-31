package cine;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Salle> salles = new ArrayList<>();

    public Cinema(String cineCoda) {
    }

    public void ajouterSalle(int numero, int capacite, Projecteur projecteur) {
        Salle salle = new Salle(numero, capacite, projecteur);
        this.salles.add(salle);
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public Salle getSalleParNumero(int numero) {
        for(Salle salle : salles) {
            if (salle.getNumero() == numero) {
                return salle;
            }
        }
        return null;
    }
}
