package map;

public class Carte {

    private int largeur;
    private int hauteur;
    private char[][] grille;

   
    public Carte() {
        this.largeur = 10;
        this.hauteur = 6;
        grille = new char[hauteur][largeur];
        generer();
    }

    
    public Carte(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        grille = new char[hauteur][largeur];
        generer();
    }

   
    public void generer() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                grille[i][j] = 'G';
            }
        }
     
        for (int i = 0; i < largeur; i++) {
            grille[0][i] = 'W';
            grille[hauteur-1][i] = 'W';
        }
        for (int i = 0; i < hauteur; i++) {
            grille[i][0] = 'M';
            grille[2][largeur-1] = 'M';
        }
    }

    public void afficher(int playerX, int playerY) {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (i == playerY && j == playerX) {
                    System.out.print("P "); 
                } else {
                    System.out.print(grille[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    public boolean estLibre(int x, int y) {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) return false;
        return grille[y][x] != 'M';
    }

 
    public char getCase(int x, int y) {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) return 'M';
        return grille[y][x];
    }

    public int getLargeur() { return largeur; }
    public int getHauteur() { return hauteur; }
}


