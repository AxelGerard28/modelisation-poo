package cine;

public class BilletPleinTarif implements Billet{
    @Override
    public String getNom() {
        return "plein tarif";
    }

    @Override
    public double getPrix(double tarifBase) {
        return tarifBase;
    }
}
