public class Sniper extends Hero{
    public Sniper(String nameHero) {
        super(80,
                80,
                2,
                new int[]{10, 15},
                nameHero);
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        return ("Снайпер : " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
