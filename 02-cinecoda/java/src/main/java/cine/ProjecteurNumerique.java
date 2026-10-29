package cine;

public class ProjecteurNumerique extends Projecteur {
    public ProjecteurNumerique(String numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public boolean estNumerique() {
        return true;
    }

    @Override
    public boolean estArgentique() {
        return false;
    }
}
