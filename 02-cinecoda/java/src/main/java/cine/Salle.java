package cine;

public class Salle {
    private final int numero;
    private final int capacite;
    private final Projecteur projecteur;

    public Salle(int numero, int capacite, Projecteur projecteur) {
        this.numero = numero;
        this.capacite = capacite;
        this.projecteur = projecteur;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public Projecteur getProjecteur() {
        return projecteur;
    }
}
