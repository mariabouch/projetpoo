package combat;

import java.util.Random;
import unit.Unit;

public class Combat {
	
        static Random random = new Random();

	    public static void attaquer(Unit attaquant, Unit defenseur) {

	        if (!attaquant.isAlive() || !defenseur.isAlive()) {
	            return;
	        }

	        int alea = random.nextInt(6);
	        int degats = attaquant.getAttack()
	                    - defenseur.getDefense()
	                    + alea;

	        if (degats < 0) {
	            degats = 0;
	        }

	        defenseur.takeDamage(degats);

	   
	      
	    }
	}
