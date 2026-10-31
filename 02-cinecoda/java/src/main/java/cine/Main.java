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

        log.info("");
        log.info("=== 2. Films et supports ===");

        Film dune = new Film("Dune 3", 166);
        Support supportDune = new FichierNumerique(dune, "30/10/2026");

        Film avengers = new Film("Avengers: Doomsday", 119);
        Support supportAvengers = new FichierNumerique(avengers, "14/10/2026");

        Film rocky = new Film("I Play Rocky", 103);
        Support supportRocky = new Copie35mm(rocky, 49);

        log.info(supportDune.getFilm().getTitre() + " (" + supportDune.getFilm().getDureeEnMinutes() + " min) : " + supportDune.getDescription());
        log.info(supportAvengers.getFilm().getTitre() + " (" + supportAvengers.getFilm().getDureeEnMinutes() + " min) : " + supportAvengers.getDescription());
        log.info(supportRocky.getFilm().getTitre() + " (" + supportRocky.getFilm().getDureeEnMinutes() + " min) : " +supportRocky.getDescription());


        log.info("");
        log.info("=== 3. Dune 3 en Salle 1 le 15/10/2026 (tarif de base 10,00 €) ===");

        Salle salle1 = cinema.getSalles().get(0);

        Seance seanceDune = new Seance(supportDune, salle1, "15/10/2026", 10.00);

        log.info(seanceDune.vendreBillet(new BilletPleinTarif()));
        log.info(seanceDune.vendreBillet(new BilletPleinTarif()));
        log.info(seanceDune.vendreBillet(new BilletEtudiant()));
        log.info(seanceDune.vendreBillet(new BilletEnfant()));

        log.info("Places restantes : " + seanceDune.getPlaceRestantes());
        log.info("Taux de remplissage : " + seanceDune.getTauxRemplissage() + " %");
        log.info("Recette : " + seanceDune.getRecetteFormatee());

        log.info("");
        log.info("=== 4. Avengers: Doomsday en Salle 1 le 15/10/2026 (tarif de base 10,00 €) ===");


        Seance seanceAvengers = new Seance(supportAvengers, salle1, "15/10/2026", 10.00);
        log.info(seanceAvengers.demarrer());


        log.info("");
        log.info("=== 5. I Play Rocky en Salle 1 le 15/10/2026 (tarif de base 10,00 €) ===");

        Seance seanceRocky1 = new Seance(supportRocky, salle1, "15/10/2026", 10.00);

        log.info(seanceRocky1.demarrer());

        log.info("État de la salle " + salle1.getNumero() + " : " + salle1.getEtat());

        log.info("");
        log.info("=== 6. I Play Rocky en Salle 2 le 15/10/2026 (tarif de base 8,00 €) ===");

        Salle salle2 = cinema.getSalles().get(1);
        Seance seanceRocky2 = new Seance(supportRocky, salle2, "15/10/2026", 8.00);

        log.info(seanceRocky2.vendreBillet(new BilletEtudiant()));
        log.info(seanceRocky2.vendreBillet(new BilletEtudiant()));
        log.info(seanceRocky2.vendreBillet(new BilletEtudiant()));
        log.info(seanceRocky2.vendreBillet(new BilletEtudiant()));

        log.info("Places restantes : " + seanceRocky2.getPlaceRestantes());
        log.info("Taux de remplissage : " + seanceRocky2.getTauxRemplissage() + " %");

        log.info(seanceRocky2.demarrer());
        log.info(seanceRocky2.terminer());
        log.info("État de la salle " + salle2.getNumero() + " : " + salle2.getEtat());

        String texteSallesLibres2 = "Salles libres : ";

        for (Salle s : cinema.getSalles()) {
            if (s.getEtat() == EtatSalle.LIBRE) {
                texteSallesLibres2 += "Salle " + s.getNumero() + ", ";
            }
        }

        log.info(texteSallesLibres2);
        log.info("Projections de la copie de « " + supportRocky.getFilm().getTitre() + " » : " + ((Copie35mm) supportRocky).getNombreProjections());


        log.info("");
        log.info("=== 7. I Play Rocky en Salle 2 le 15/10/2026 (tarif de base 8,00 €) ===");
        log.info(seanceRocky2.demarrer());
        log.info(salle2.nettoyer());
        log.info(seanceRocky2.demarrer());

        log.info("");
        log.info("=== 8. Programmation en Salle 3 ===");

        int numeroRecherche = 3;
        Salle salle3 = cinema.getSalleParNumero(numeroRecherche);
        if (salle3 == null) {
            log.info("Programmation refusée : le cinéma CinéCoda n'a pas de salle " + numeroRecherche);
        } else {
            log.info( "salle : " + salle3.getNumero());
        }
        // Possibilité de réutiliser au début, je pense, à voir si j'ai le temps de refacto.



        // Rejouez ici le scénario de l'énoncé, en affichant chaque étape avec log.info(...)
    }
}
