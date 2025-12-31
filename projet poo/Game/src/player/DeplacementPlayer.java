package player;

import map.Carte;
import ressources.GestionnaireRessources;


	public class DeplacementPlayer {

	    private int x;
	    private int y;
	    private GestionnaireRessources ressources;
	    private Carte carte; 

	    
	    public DeplacementPlayer(Carte carte) {
	        this.carte = carte;
	        this.x = 1; 
	        this.y = 1;
	        this.ressources = new GestionnaireRessources();
	    }

	    
	    public void deplacer(char direction) {
	        int newX = x;
	        int newY = y;

	        switch(direction) {
	            case 'z': newY -= 1; break; 
	            case 's': newY += 1; break; 
	            case 'q': newX -= 1; break; 
	            case 'd': newX += 1; break; 
	            default:
	                System.out.println("Direction invalide !");
	                return;
	        }

	       
	        if (carte.estLibre(newX, newY)) {
	            x = newX;
	            y = newY;
	        } else {
	            System.out.println("Impossible de se déplacer ici !");
	        }
	    }

	    public int getX() { return x; }
	    public int getY() { return y; }
	    public GestionnaireRessources getRessources() { return ressources; }

	    
	    public int pecher(char terrain) {
	        if (terrain == 'W') {
	            ressources.AjouterRessources("Poisson", 5);
	            System.out.println("Tu as pêché 5 poissons !");
	            return 5;
	        } else {
	            System.out.println("Pas d’eau ici !");
	            return 0;
	        }
	    }
	}


