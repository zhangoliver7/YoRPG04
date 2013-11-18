public class Urakhai extends Character {


        public Urakhai() {
                int randomStr = (int)(Math.random() * 45);
		int randomDef = (int)(Math.random() * 20);
		int randomHP = (int)(Math.random() * 100);
		randomStr += 20;
		strength = randomStr;
		hp = randomHP + 70;	
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

        public int specialAtt(Character tom) {
             return 0;
        
        }
        
}

   

