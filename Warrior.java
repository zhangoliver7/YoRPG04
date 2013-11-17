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
	defense -= 5;
	attRating += 0.2;
    }	

    public void normalize() {
	defense = 10;
	attRating = 0.4;
    }	



}
