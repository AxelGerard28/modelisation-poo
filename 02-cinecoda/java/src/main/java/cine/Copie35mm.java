package cine;

public class Copie35mm extends Support {
    private int nombreProjections;

    public Copie35mm(Film film, int nombreProjections) {
        super(film);
        this.nombreProjections = nombreProjections;
    }
    public int getNombreProjections() {
        return nombreProjections;
    }

    @Override
    public String getDescription() {
        return "copie 35 mm, " + nombreProjections + " projections";
    }

    @Override
    public String verifier(Projecteur projecteur, String dateSeance) {
        if(!projecteur.estArgentique()) {
            return "une copie 35 mm ne peut pas être lue par un projecteur numérique";
        }

        if (this.nombreProjections >= 50) {
            return "la copie 35 mm de « " + getFilm().getTitre() + " » est usée (50 projections)";
        }
        return null;
    }

    @Override
    public void utiliser() {
        this.nombreProjections++;
    }
}
