package cine;

public class ProjecteurArgentique extends Projecteur {
    public ProjecteurArgentique(String numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public boolean estNumerique() {
        return false;
    }

    @Override
    public boolean estArgentique() {
        return true;
    }
}
