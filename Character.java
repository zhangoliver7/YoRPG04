public abstract class Character {

	protected int hp;
	protected int strength;
	protected int defense;
	protected double attRating;
	
	
	public abstract void normalize();
	public abstract void specialize();
	public abstract int specialAtt(Character tom);

	public boolean isAlive() {
		return hp > 0;
	}

	public int getDefense() {
		return defense;
	}

	public int getHP() {
		if (hp > 0) 
			return hp;
		else 
			return 0;
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
		return  "1: The Warrior: Aragon - Hacks and Slashes\n" + 
			"2: The Elf: Legolas - Shoots arrows\n" +
			"3: The Dwarf: Gimile - Wields a huge axe\n" +
			"4: The Wizard: Gandalf - Casts spells\n" +
			"5: The Hobbit: Frodo - Small, scrawny, but quick and smart" ; 
	}

}
