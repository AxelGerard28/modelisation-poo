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

    @Override
    public String verifier(Projecteur projecteur, String dateSeance) {
        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.LocalDate dateS = java.time.LocalDate.parse(dateSeance, fmt);
        java.time.LocalDate dateE = java.time.LocalDate.parse(this.dateExpiration, fmt);

        if (dateS.isAfter(dateE)) {
            return "la clé de lecture de « " + getFilm().getTitre() + " » a expiré le " + this.dateExpiration;
        }

        return null;
    }

    @Override
    public void utiliser() {
    }

    public String getDateExpiration() {
        return dateExpiration;
    }
}
