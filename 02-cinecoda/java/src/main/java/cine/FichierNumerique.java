package cine;

public class FichierNumerique extends Support {
    private final String dateExpiration;

    public FichierNumerique(Film film, String dateExpiration) {
        super(film);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String getDescription() {
        return "fichier numérique, clé valable jusqu'au " + dateExpiration;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }
}
