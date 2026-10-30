package cine;

public class BilletEnfant implements Billet{
    @Override
    public String getNom() {
        return "enfant";
    }

    @Override
    public double getPrix(double tarifBase) {
        return tarifBase * 0.50;
    }
}
