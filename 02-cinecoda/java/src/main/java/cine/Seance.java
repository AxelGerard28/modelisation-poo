package cine;

import java.util.Locale;

public class Seance {
    private final Support support;
    private final Salle salle;
    private final String date;
    private final double tarifBase;
    private double recette = 0.0;
    private int placesVendues = 0;

    public Seance(Support support, Salle salle, String date, double tarifBase) {
        this.support = support;
        this.salle = salle;
        this.date = date;
        this.tarifBase = tarifBase;
    }

    public String vendreBillet(Billet billet) {
        double prix = billet.getPrix(tarifBase);
        this.recette += prix;
        this.placesVendues++;

        return "Billet " + billet.getNom() + " vendu : " + String.format(Locale.FRANCE, "%.2f €", prix);
    }

    public int getPlaceRestantes() {
        return salle.getCapacite() - placesVendues;
    }

    public int getTauxRemplissage() {
        return (int) Math.round((double) placesVendues / salle.getCapacite() * 100);
    }

    public String getRecetteFormatee() {
        return String.format(Locale.FRANCE, "%.2f €", recette);
    }
}
