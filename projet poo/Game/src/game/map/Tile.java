package game.map;

public class Tile {
	
	private final int x;
	private final int y;
	private final Terraintype terraintype;
	
	public Tile(int x, int y, Terraintype terraintype) {
		this.x = 0;
		this.y = y;
		this.terraintype = terraintype;
	}
	 public boolean isAccessible() {
	        return terraintype.isAccessible();
	    }

	    public String getResource() {
	        return terraintype.getRessources();
	    }
	
	public Terraintype getTerraintype() {
		return terraintype;
	}
    

}
