package player;

import java.util.ArrayList;
import java.util.List;
import ressources.GestionnaireRessources;
import unit.Unit;
import batiments.Batiments;

public class Player {
	
    private String name;
    private int pointsDeVie;
    private GestionnaireRessources ressources;
    private List<Unit> units;
    private List<Batiments> batiments;

    public Player(String name) {
        this.name = name;
        this.pointsDeVie = 100;
        this.ressources = new GestionnaireRessources();
        this.units = new ArrayList<>();
        this.batiments = new ArrayList<>();
    }

    public String getName() { 
    	return name; 
    	}
    public int getPointsDeVie() {
    	return pointsDeVie;
    	}
    public GestionnaireRessources getRessources() {
    	return ressources;
    	}
    public List<Unit> getUnits() { 
    	return units;
    	}
    public List<Batiments> getBatiments() {
    	return batiments; 
    	}

    public void ajouterBatiment(Batiments b) {
    	batiments.add(b);
    	}
    public boolean aBatiment(String nom) {
        for (Batiments b : batiments) if (b.getNom().equalsIgnoreCase(nom)) return true;
        return false;
    }

    public void productionAutomatique() {
        for (Batiments b : batiments) {}
    }

    public void ajouterNourriture(int quantite) {
    	ressources.AjouterRessources("Nourriture", quantite);
    	}
    public void depenserNourriture(int quantite) {
    	
        int actuel = ressources.getRessources().getOrDefault("Nourriture", 0);
        if (quantite <= actuel) ressources.SoustraireResources(quantite);
        else System.out.println("Pas assez de nourriture !");
    }

    public void ajouterOr(int quantite) { 
    	ressources.AjouterRessources("Or", quantite); 
    	}
    public void depenserOr(int quantite) {
        int actuel = ressources.getRessources().getOrDefault("Or", 0);
        if (quantite <= actuel) ressources.SoustraireResources(quantite);
        else System.out.println("Pas assez d'or !");
    }

    public void removeUnit(Unit u) { 
    	units.remove(u); 
    	}
    public void collectResource(String type, int amount) {
    	ressources.AjouterRessources(type, amount); 
    	}
}


