package batiments;

 public class CentreCommandement extends Batiments {
	     public CentreCommandement() {
	    	 
	         super("CentreCommandement",350 ,4);
         System.out.println("Batiment cree : " + nom + " cout : " + cout +  " temps : " + tempsConstruction);
         
  }
	    
	  @Override
	  public void fonctionner() {
	  System.out.println("CentreCommandement pret pour gerer l'economie");
	 }
	  
 }


