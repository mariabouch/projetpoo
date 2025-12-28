package unit;

public abstract class Unit {
	
	    protected String name;
	    protected int hp;
	    protected int attack;
	    protected int defense;
	    protected int range;

	    public boolean isAlive() {
	        return hp > 0;
	    }

	    public void takeDamage(int dmg) {
	        hp -= dmg;
	    }

	    public int getAttack() { return attack; }
	    public int getDefense() { return defense; }
	    public int getHp() { return hp; }
	    public int getRange() { return range; }
	    public String getName() { return name; }
	}



