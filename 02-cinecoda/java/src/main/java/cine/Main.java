package cine;

import java.util.logging.Logger;

public class Main {
    private static Logger log;

    public static void main(String[] args) {
        log = ConsoleLogger.create("cine.scenario");
        Cinema cinema = new Cinema("CineCoda");
        cinema.ajouterSalle(1,100);

        // Rejouez ici le scénario de l'énoncé, en affichant chaque étape avec log.info(...)
    }
}
