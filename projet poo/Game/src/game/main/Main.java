package game.main;


 import java.util.Scanner;
 import map.Carte;
 import player.Player;
 import player.DeplacementPlayer;
 import batiments.*;
 import unit.Soldier;
 import unit.Archer;
 import combat.Combat;

    	public class Main {
    	    public static void main(String[] args) {
    	    	
     Scanner sc = new Scanner(System.in);
     Player joueur = new Player("Yasmine");
     DeplacementPlayer deplacementPlayer = new DeplacementPlayer();
     Carte carte = new Carte();

    	  boolean enCours = true;

    	  while (enCours) {
       carte.afficher(deplacementPlayer.getX(), deplacementPlayer.getY());
        System.out.println("\n=== MENU ===");
        System.out.println("1. Déplacer joueur (z,s,q,d)");
        System.out.println("2. Construire bâtiment");
        System.out.println("3. Entraîner unité");
        System.out.println("4. Pêcher");
        System.out.println("5. Vendre poissons");
    	System.out.println("6. Combattre");
    	System.out.println("7. Mes unités");
        System.out.println("8. Mes bâtiments");
        System.out.println("0. Quitter");
        System.out.print("Choix: ");
        int choix = sc.nextInt();

        switch (choix) {

         case 1: 
       System.out.print("Direction (z,s,q,d): ");
        char dir = sc.next().charAt(0);
        deplacementPlayer.deplacer(dir);
          break;

      case 2: 
    System.out.println("1. CampEntrainement  2. CentreCommandement  3. Marche  4. Production");
    System.out.print("Choisir bâtiment: ");
      int bChoix = sc.nextInt();
       Batiments bat = null;
       switch (bChoix) {
        case 1: bat = new CampEntrainement();
        break;
        case 2: bat = new CentreCommandement();
         break;
         case 3: bat = new Marche();
         break;
       case 4: bat = new Production();
       break;
       }
    if (bat != null) joueur.ajouterBatiment(bat);
       break;	    			                   
       case 3: 

       if (joueur.aBatiment("CampEntrainement")) {
     System.out.println("1. Soldier  2. Archer");
       System.out.print("Choisir unité: ");
             int uChoix = sc.nextInt();

             switch (uChoix) {
     case 1:        
     if (joueur.getRessources().getRessources().getOrDefault("Nourriture", 0) >= 10) {
     joueur.getUnits().add(new Soldier());
     joueur.depenserNourriture(10);
      System.out.println("Soldier entraîné !");
 } 
    else System.out.println("Ressources insuffisantes !");
    break;
    case 2:
      if (joueur.getRessources().getRessources().getOrDefault("Nourriture", 0) >= 15) {
    joueur.getUnits().add(new Archer());
    joueur.depenserNourriture(15);
    System.out.println("Archer entraîné !");
    } 
      else System.out.println("Ressources insuffisantes !");
      break;
    }
   } 
       else System.out.println("Vous avez besoin d'une caserne !");
    	 break;

    	 case 4: 
    	 char terrain = carte.getCase(deplacementPlayer.getX(), deplacementPlayer.getY());
			int quantitepeche = deplacementPlayer.pecher(terrain);
			joueur.ajouterNourriture(quantitepeche);
    	    break;
    	   case 5: 
    	     System.out.print("Combien de poissons vendre ? Vous avez " + joueur.getRessources().getRessources().getOrDefault("Poisson", 0) + " : ");
    	    	 int quantite = sc.nextInt();
    	    	 int dispo = joueur.getRessources().getRessources().getOrDefault("Poisson", 0);
    	    	if (quantite <= dispo && quantite > 0) {
    	    	int gain = quantite * 3;
    	    	 joueur.getRessources().vendrePoissons("Or", quantite);
    	    	joueur.ajouterOr(gain);
    	    	System.out.println("Vente réussie ! Gain: " + gain + " or");
    	    	} 
    	    	else System.out.println("Quantité invalide !");
    	    			                    break;

    	    	case 6: 
    	    	 if (!joueur.getUnits().isEmpty()) {
    	    	System.out.println("=== COMBAT ===");
    	    	if (joueur.getUnits().size() >= 2)
    	     Combat.attaquer(joueur.getUnits().get(0), joueur.getUnits().get(1));
    	    else 
    	    	System.out.println("Pas assez d'unités pour combattre !");
    	} 
    	    	 else System.out.println("Vous n'avez pas d'unités !");
    	    	 break;

    	        case 7: 
    	    	System.out.println("=== MES UNITÉS ===");
    	    		int i = 1;
    	    		 for (var u : joueur.getUnits()) System.out.println(i++ + ". " + u.getClass().getSimpleName());
    	    			 break;

    	    	 case 8: 
    	    		 System.out.println("=== MES BÂTIMENTS ===");
    	    			 int j = 1;
    	    			   for (var b : joueur.getBatiments()) System.out.println(j++ + ". " + b.getNom());
    	    			      break;

    	    	 case 0: 
    	    	   enCours = false;
    	    	 break;
    	    	default: 
    	     System.out.println("Choix invalide !");
 }

             joueur.productionAutomatique();
 }

             System.out.println("\n=== FIN DU JEU ===");
              if (joueur.getPointsDeVie() <= 0) System.out.println("Vous avez été vaincu !");
    	    			        sc.close();
   }
 }
