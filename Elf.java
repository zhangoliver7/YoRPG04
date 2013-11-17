public class Elf extends Character{
    private String name;

    public Elf(String s) {
        name = s;
        hp = 125;
        strength = 110;
        defense = 15;
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
        defense = defense / 2;
        int damage =(int)(strength * attRating - tom.getDefense());
        tom.lowerHP(damage * 3);
        return damage;
        
    }

}
