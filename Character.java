public abstract class Character {

	protected int hp;
	protected int strength;
	protected int defense;
	protected double attRating;
	
	
	public abstract void normalize();
	public abstract void specialize();
	public abstract void specialAtt();

	public boolean isAlive() {
		return hp > 0;
	}

	public int getDefense() {
		return defense;
	}

	public int getStrength() {
		return strength;
	}

	public void lowerHP(int x) {
		hp -= x;
	}

	public int attack(Character tom) {
		int damage =(int)(strength * attRating - tom.getDefense());
		tom.lowerHP(damage);
		return damage;
	}
	
	public static String about() {
		return "The Warrior: Aragon - Hacks and Slashes\n" + 
			"The Elf: Legolas - Shoots arrows\n" +
			"The Dwarf: Gimile - Wields a huge axe\n" +
			"The Wizard: Gandalf - Casts spells\n" +
			"The Hobbit: Frodo - Small, scrawny, but quick and smart" ; 
	}

}
