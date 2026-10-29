package cine;

public class Film {
    private final String titre;
    private final int dureeEnMinutes;

    public Film(String titre, int dureeEnMinutes) {
        this.titre = titre;
        this.dureeEnMinutes = dureeEnMinutes;
    }
    public String getTitre() {
        return titre;
    }

    public int getDureeEnMinutes() {
        return dureeEnMinutes;
    }
}
