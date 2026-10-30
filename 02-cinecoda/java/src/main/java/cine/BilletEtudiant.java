package cine;

public class BilletEtudiant implements Billet {
    @Override
    public String getNom() {
        return "étudiant";
    }

    @Override
    public double getPrix(double tarifBase) {
        return tarifBase * 0.75;
    }
}
