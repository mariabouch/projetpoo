package player;

import ressources.GestionnaireRessources;


	public class DeplacementPlayer {
	    private int x;
	    private int y;
	    private GestionnaireRessources ressources;

	    public DeplacementPlayer() {
	        x = 2;
	        y = 2;
	        ressources = new GestionnaireRessources();
	    }

	    public void deplacer(char direction) {
	        switch (direction) {
	            case 'z' -> { if (y > 0) y--; }
	            case 's' -> { if (y < 4) y++; }
	            case 'q' -> { if (x > 0) x--; }
	            case 'd' -> { if (x < 4) x++; }
	        }
	    }

	    public int getX() { return x; }
	    public int getY() { return y; }
	    public GestionnaireRessources getRessources() { return ressources; }

	    public int pecher(char terrain ) {
	        if (terrain == 'W' ) {
	            ressources.AjouterRessources("Poisson", 5);
	            System.out.println("Tu as pêché 5 poissons !");
	            return 5;
	        } else {
	            System.out.println("Pas d’eau ici  !");
	            return 0;
	        }
	    }
	}


