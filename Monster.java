//Oliver Zhang
//pd 8
//2013-11-12
//HW 23
public class Monster extends Character {


	public Monster() {
		int random = (int)(Math.random() * 45);
		random += 20;
		strength = random;
		hp = 150;	
		defense = 20;	
		attRating = 1.0;
	}

	public String toString() {
		String retStr = "Monster " + hp + " " + strength + " " + defense + " " + attRating;
		return retStr;
	}

	

	public void normalize()
	{};
	
	public void specialize()
	{};

	public void specialAtt()
	{};

	
}
