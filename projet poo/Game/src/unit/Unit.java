package unit;

public abstract class Unit {
    protected String nom;
    protected int pointsDeVie;
    protected int attaque;

    public Unit(String nom, int pv, int attaque) {
        this.nom = nom;
        this.pointsDeVie = pv;
        this.attaque = attaque;
    }

    public String getNom() { return nom; }
    public int getPointsDeVie() { return pointsDeVie; }
    public int getAttaque() { return attaque; }

    public boolean estVivant() { return pointsDeVie > 0; }

    public void recevoirDegats(int degats) {
        pointsDeVie -= degats;
        if (pointsDeVie < 0) pointsDeVie = 0;
    }
}




