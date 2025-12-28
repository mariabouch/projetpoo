package batiments;


	public abstract class Batiments {
		
		    protected String nom;
		    protected int cout;
		    protected int tempsConstruction;

		    public Batiments(String nom, int tempsConstruction , int cout) {
		        this.nom = nom;
		        this.tempsConstruction = tempsConstruction;
		        this.cout = cout ;
		    }

		    public String getNom() {
		        return nom;
		    }

		    public int getCout() {
		        return cout;
		    }

		    public int getTempsConstruction() {
		        return tempsConstruction;
		    }

		    public abstract void fonctionner(); 
		}


