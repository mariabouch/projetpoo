package map;

public class Carte {
	
    private char[][] grille = {
            {'W','W','W','W','W'},
            {'G','W','G','G','G'},
            {'G','G','W','W','G'},
            {'W','W','W','G','G'},
            {'M','M','W','M','M'}
        };

        public void afficher(int px, int py) {
            System.out.println("\nCarte :");
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (x == px && y == py)
                        System.out.print("P ");
                    else
                        System.out.print(grille[y][x] + " ");
                }
                System.out.println();
            }
        }

        public char getCase(int x, int y) {
            return grille[y][x];
        }
  }


