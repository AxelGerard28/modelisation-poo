package cine;

public abstract class Support {
    private final Film film;

    public Support(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }

    public abstract String getDescription();
    public abstract String verifier(Projecteur projecteur, String dateSeance);
    public abstract void utiliser();

}
