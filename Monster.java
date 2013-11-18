//Oliver Zhang
//pd 8
//2013-11-12
//HW 23
public class Monster extends Character {


	public Monster() {
		int randomStr = (int)(Math.random() * 45);
		int randomDef = (int)(Math.random() * 20);
		int randomHP = (int)(Math.random() * 100);
		randomStr += 20;
		strength = randomStr;
		hp = randomHP + 50;	
		defense = randomDef;	
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

	public int specialAtt(Character Tom)
	{return 0;};

	
}
