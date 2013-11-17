public class Hobbit extends Character{
    private String name;

    public Hobbit(String s) {
        name = s;
        hp = 125;
        strength = 95;
        defense = 30;
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
        defense = 20;
        attRating = 0.4;
    }        

    public void specialAtt() {
        hp -= 5;
        int damage =(int)(strength * attRating - tom.getDefense());
        tom.lowerHP(damage);
        return damage;
        
    }

}
