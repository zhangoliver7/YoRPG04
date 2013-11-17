public abstract class Character {
		protected int hp;
		protected int strength;
		protected int defense;
		protected double attRating;
		
		public abstract void normalize();
		public abstract void specialize();
	
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
			return "What character would you like to choose?\n The Warrior (slice and dice)\n The Mage (no, not the bunny and hat kind)\n The Rogue (Le Assassin)?\n Either way, you shall fall prey to the countless monsters waiting for your arrival!!! MUAHAHHA!"; 
		}
	
	

}
