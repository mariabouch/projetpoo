package batiments;

   public class Marche extends Batiments {
	  
	       public Marche() {
	           super("Marche",150 ,3);
	           System.out.println("Batiment cree : " + nom + " cout : " + cout +  " temps : " + tempsConstruction);
	       }

	       @Override
	       public void fonctionner() {
	           System.out.println("Marche ouvert vous pouvez echanger des Ressources:");
	       }
	   }
