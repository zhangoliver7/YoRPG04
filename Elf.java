public class Elf extends Character{
    private String name;

    public Warrior(String s) {
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
        
    }

}
