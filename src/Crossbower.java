public class Crossbower extends Hero {


    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10, 15}, nameHero, posX, posY );
        rangeMaxDamage = 4;
        Vector2 position;
    }
protected int rangeMaxDamage;
protected Vector2 position;




    @Override
    public String toString() {
        return ("Арбалетчик: " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
