package game.map;

public class Terraintype {
	
     public static final Terraintype GRASS = new Terraintype(true,"food");
     public static final Terraintype WATER = new Terraintype(true, "fish");
     public static final Terraintype MONTAIN = new Terraintype(false, "stone");
     
     private final boolean accessible;
     private final String ressources;
     

     Terraintype(boolean accessible, String ressources) {
         this.accessible = accessible;
         this.ressources = ressources;
     }

     public boolean isAccessible() {
         return accessible;
     }

     public String getRessources() {
         return ressources;
     }
 }
