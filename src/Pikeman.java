public class Pikeman extends Hero {

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY );
    }
protected Vector2 position;
    @Override
    public String toString() {
        return ("Копейщик : " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
