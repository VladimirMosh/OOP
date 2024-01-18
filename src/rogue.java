public class rogue extends Hero {

    public rogue(String nameHero, int posX, int posY) {
        super(100, 100, 10, new int[]{20, 30}, nameHero, posX, posY );
    }
    protected Vector2 position;

    @Override
    public String toString() {
        return ("Разбойник: " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
