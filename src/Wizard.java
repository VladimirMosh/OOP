public class Wizard extends Hero{
    public Wizard(String nameHero) {
        super(50,
                50,
                1,
                new int[]{-30, -35},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Колдун: " + nameHero + " Здоровье " + health + "/" + healthMax + " Броня: " + armor);
    }
}
