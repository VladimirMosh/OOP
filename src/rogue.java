public class rogue extends Hero {


    public rogue(String nameHero) {
        super(100,
                100,
                10,
                new int[]{20, 30},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Разбойник: " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
