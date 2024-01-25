package OOP.Heroes;

import OOP.TypeOfHeroes.HealerHero;
import OOP.Vector2;

public class Monk extends HealerHero {

    public Monk(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{10, 15}, nameHero, posX, posY, 50, 50);
        Vector2 position;
    }

    @Override
    public String toString() {
        return ("Монах: " + super.toString());
    }
    @Override
    public String getInfo() {
        return "Монах";
    }
}