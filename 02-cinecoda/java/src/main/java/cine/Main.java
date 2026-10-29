package cine;

import java.util.logging.Logger;

public class Main {
    private static Logger log;

    public static void main(String[] args) {
        log = ConsoleLogger.create("cine.scenario");

        log.info("=== 1. Création du cinéma CinéCoda ===");

        Cinema cinema = new Cinema("CineCoda");
        cinema.ajouterSalle(1,100, new ProjecteurNumerique("PN-1"));
        cinema.ajouterSalle(2, 3, new ProjecteurArgentique("PA-1"));

        for (Salle salle : cinema.getSalles()) {
            String typeProjecteur = salle.getProjecteur().estNumerique() ? "numérique" : "argentique";
            log.info("Salle " + salle.getNumero() + " : " + salle.getCapacite() + " places, projecteur " + typeProjecteur);
        }


        String textSallesLibres = "Salles libres : ";
        for (Salle salle : cinema.getSalles()) {
            textSallesLibres += "Salle " + salle.getNumero() + ", ";
        }

        log.info(textSallesLibres);



        // Rejouez ici le scénario de l'énoncé, en affichant chaque étape avec log.info(...)
    }
}
