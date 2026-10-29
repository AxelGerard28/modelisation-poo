package cine;

public abstract class Projecteur {
    private final String numeroSerie;

    public Projecteur(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public abstract boolean estNumerique();
    public abstract boolean estArgentique();
}
