package cine;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Salle> salles = new ArrayList<>();

    public Cinema(String cineCoda) {
    }

    public void ajouterSalle(int numero, int capacite) {
        Salle salle = new Salle(numero, capacite);
        this.salles.add(salle);
    }
}
