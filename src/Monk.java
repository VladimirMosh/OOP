public class Monk extends Hero {

    public Monk(String nameHero) {
        super(50,
                50,
                1,
                new int[]{-30, -35},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Манах: " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
