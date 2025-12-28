package ressources; 

 import java.util.HashMap;
 import java.util.Map;
 
 public class GestionnaireRessources {
	
	     private Map<String, Integer> Ressources;

	     public GestionnaireRessources() {
	         Ressources = new HashMap<>();
	         Ressources.put("Or", 500);
	         Ressources.put("Bois", 300);
	         Ressources.put("Pierre", 200);
	         Ressources.put("Nourriture", 100);
	         Ressources.put("Poisson", 1000);
	     }

	     public Map<String, Integer> getRessources() {
	         return Ressources;
	     }

	     public void AjouterRessources(String nom, int quantite) {
	         int quantiteActuelle = Ressources.getOrDefault(nom, 0);
	         int nouvellequantite = quantiteActuelle + quantite;
	         Ressources.put(nom, nouvellequantite);
	         System.out.println("nom;" + nom + " nouvelle;" + nouvellequantite);
	     }

	     public boolean VerifierRessources(int cout) {
	         for (Map.Entry<String, Integer> entry : Ressources.entrySet()) {
	             int quantiteActuelle = entry.getValue();
	             if (quantiteActuelle < cout) return false;
	         }
	         return true;
	     }

	     public void SoustraireResources(int cout) {
	         for (Map.Entry<String, Integer> entry : Ressources.entrySet()) {
	             String nom = entry.getKey();
	             int quantiteActualle = Ressources.getOrDefault(nom, 0);
	             int NouvelleQuantite = quantiteActualle - entry.getValue();
	             Ressources.put(nom, NouvelleQuantite);
	         }
	     }

	     public void vendrePoissons(String RessourcesPayee, int quantiteVendu) {
	         int quantitePoisson = Ressources.getOrDefault("Poisson", 0);
	         if (quantitePoisson <= 0) {
	             System.out.println("Pas de Poissons à vendre !");
	             return;
	         }
	         int paiement = switch (RessourcesPayee) {
	             case "Or" -> quantiteVendu * 2;
	             case "Bois" -> quantiteVendu * 1;
	             case "Pierre" -> quantiteVendu * 3;
	             default -> {
	                 System.out.println("Ressource inconnue !");
	                 yield 0;
	             }
	         };
	         Ressources.put("Poisson", quantitePoisson - quantiteVendu);
	         System.out.println(quantiteVendu + " Poissons → " + paiement + RessourcesPayee);
	     }

	     public void AfficherRessource() {
	         System.out.println("Ressources du joueur :");
	         for (Map.Entry<String, Integer> entry : Ressources.entrySet()) {
	             System.out.println(entry.getKey() + " : " + entry.getValue());
	         }
	     }
	 }
      
     
       
 

