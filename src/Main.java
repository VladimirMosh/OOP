import java.util.ArrayList;
import java.util.Random;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        heroesTeam1 = generateCommand(0, 0);
        heroesTeam2 = generateCommand(3, 9);

        heroesTeam1.forEach(n -> System.out.println(n.toString()));
        System.out.println("__________________________");
        heroesTeam2.forEach(n -> n.printEnemyDistance(heroesTeam1));
    }

    static ArrayList<Hero> heroesTeam1 = new ArrayList<>();
    static ArrayList<Hero> heroesTeam2 = new ArrayList<>();
    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1, 5)+n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName(),i,y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(),i,y));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(),i,y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(),i,y));
                    break;
                case 5:
                    commandHeroes.add(new rogue(getName(),i,y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(),i,y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(),i,y));
                    break;



            }
        }


        return commandHeroes;
    }

    static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length-1)].name();
    }

}