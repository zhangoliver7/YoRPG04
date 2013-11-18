//Oliver Zhang
//pd 8
//2013-11-12
//HW 23
public class Warrior extends Character {
    private String name;

    public Warrior(String s) {
	name = s;
	hp = 125;
	strength = 100;
	defense = 10;
	attRating = 0.4;
    }
    
    public String toString() {
	String retStr = name + " " + hp + " " + strength + " " + defense + " " + attRating;
	return retStr;
    }
    
    public String getName() {
	return name;
    }
   

    public void specialize() {
	defense -= 10;
	attRating += 0.2;
    }	

    public void normalize() {
	defense = 10;
	attRating = 0.4;
    }	

    public int specialAtt(Character tom) {
		int damage =(int)((strength * attRating * 3) - tom.getDefense());
		tom.lowerHP(damage);
		lowerHP(15);
		System.out.println("You had a dose of epic and charged, causing mighty damage!! But you got fatigued!!!\n");
		return damage;
    };


}
