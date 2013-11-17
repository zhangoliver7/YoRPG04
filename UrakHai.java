public class Monster extends Character {


        public Monster() {
                int random = (int)(Math.random() * 45);
                random += 20;
                strength = random + 15;
                hp = 150;        
                defense = 10;        
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

        public void specialAtt() {
                hp -= 20;
                int damage =(int)(strength * attRating - tom.getDefense());
                tom.lowerHP(damage * 3);
                return damage;
        
        }
        
}

   

}
