package combat;

import unit.Unit;


	public class Combat {

		 public static void attaquer(Unit attaquant, Unit cible) {
		        if (!attaquant.estVivant()) {
		            System.out.println(attaquant.getNom() + " est mort et ne peut pas attaquer !");
		            return;
		        }
		        if (!cible.estVivant()) {
		            System.out.println(cible.getNom() + " est déjà mort !");
		            return;
		        }

		        
		        System.out.println(attaquant.getNom() + " attaque " + cible.getNom() + " pour " + attaquant.getAttaque() + " dégâts !");
		        cible.recevoirDegats(attaquant.getAttaque());

		       
		        System.out.println(cible.getNom() + " a maintenant " + cible.getPointsDeVie() + " PV");

		      
		        if (!cible.estVivant()) {
		            System.out.println(cible.getNom() + " est vaincu !");
		        }
		    }
		}
