package game.map;

public class Gamemap {
	
	private final int width;
	private final int height;
	private final Tile[][] tiles;
	Terraintype type;
	
	public Gamemap(int width, int height) {
		this.width = width;
		this.height = height;
		this.tiles =new Tile [width][height];
		generatemap();
	}
		private void generatemap() {
			for(int x=0 ; x<width ; x++) {
				for(int y = 0 ; y<height ; y++) {
					
					
					int r = (int) (Math.random() * 10);

					if (r < 2) {
					    type = Terraintype.WATER;
					} 
					else if (r < 4) {
					    type = Terraintype.MONTAIN;
					} 
					else {
					    type = Terraintype.GRASS;
					}

			    tiles[x][y] = new Tile(x,y,type);
				}
			}
	   
		}


      public Tile getTile(int x, int y) {
          return tiles[x][y];

	}

}