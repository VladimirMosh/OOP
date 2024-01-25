package OOP;



import OOP.Interfaces.GameI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public abstract class Hero implements GameI {

    public int health, healthMax, armor, initiative;
    public Random random = new Random();
    public int[] damage;
    public String nameHero;
    public Vector2 position;

    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int initiative) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
        this.initiative = initiative;
    }
    public void getDamage(int damage){
        health -= damage;
        if (health < 0) health = 0;
    }


    public void printEnemysDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }


    public float findMinDistance(ArrayList<Hero> enemys) {
        ArrayList<Float> distances = new ArrayList<>();
        enemys.forEach(n -> distances.add(position.rangeEnemy(n.position)));
        float minDistance = Collections.min(distances);
        return minDistance;
    }

    public Hero findNearestEnemy(ArrayList<Hero> enemys) {
        Hero heroTMP = null;
        for (int i = 0; i < enemys.size(); i++) {
            if (enemys.get(i).health>0){
                if (heroTMP == null || this.position.rangeEnemy(enemys.get(i).position) < this.position.rangeEnemy(heroTMP.position)) {
                    heroTMP = enemys.get(i);
                }
            }

        }
        return heroTMP;
    }

    public abstract String getType();


    public int[] getCoords() {
        return new int[]{position.posX, position.posY};
    }

    public int getInitiative(){
        return initiative;
    }

    public int getHp() {
        return health;
    }
    public abstract String getInfo();


}