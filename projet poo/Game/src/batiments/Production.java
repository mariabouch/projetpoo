package batiments;


public class Production extends Batiments {

	    public Production() {
	        super("Production",150 ,4);
	        System.out.println("Batiment cree : " + nom + " cout : " + cout +  " tempsContruction : " + tempsConstruction);
	    }

	    @Override
	    public void fonctionner() {
	        System.out.println("Mine pret pour produire l'Or ou Pierre");
	    }
	}