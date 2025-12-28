package batiments;

	public class CampEntrainement extends Batiments {

		    public CampEntrainement() {
		        super("CampEntrainement", 200, 2);
		        System.out.println("Batiment cree:" + nom + " cout ;" + cout + " tempsConstruction ; " + tempsConstruction);
		    }

		    @Override
		    public void fonctionner() {
		        System.out.println("Camp d'entainemment pret pour entrainner des soldats");
		    }
		}


