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
        if (placesVendues >= salle.getCapacite()) {
            return "Vente refusée : la séance est complète (" + salle.getCapacite() + " places)";
        }
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

    public String demarrer() {
        if (salle.getEtat() != EtatSalle.LIBRE) {
            return "Démarrage refusé : la Salle " + salle.getNumero() + " n'est pas libre (état : " + salle.getEtat() + ")";
        }

        String erreur = support.verifier(salle.getProjecteur(), date);
        if(erreur != null) {
            return "Démarrage refusé : " + erreur;
        }
        salle.setEtat(EtatSalle.EN_SEANCE);
        support.utiliser();
        return "Séance démarrée";
    }

    public String terminer() {
        salle.setEtat(EtatSalle.NETTOYAGE);
        return "Séance terminée";
    }

    public double getRecette() {
        return recette;
    }

    public String getBilan() {
        return support.getFilm().getTitre() + ", Salle " + salle.getNumero() +
                " : " + placesVendues + " billet(s), recette " + getRecetteFormatee();
    }
}
