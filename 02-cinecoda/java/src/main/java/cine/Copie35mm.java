package cine;

public class Copie35mm extends Support {
    private final int nombreProjections;

    public Copie35mm(Film film, int nombreProjections) {
        super(film);
        this.nombreProjections = nombreProjections;
    }

    @Override
    public String getDescription() {
        return "copie 35 mm, " + nombreProjections + " projections";
    }

    @Override
    public String verifier(Projecteur projecteur, String dateSeance) {
        return "";
    }
    public int getNombreProjections() {
        return nombreProjections;
    }
}
