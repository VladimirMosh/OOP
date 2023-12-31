import java.util.ArrayList;
import java.util.Random;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        heroesTeam1 = generateCommand(0);
        heroesTeam2 = generateCommand(3);

        heroesTeam1.forEach(n -> System.out.println(n.toString()));
        System.out.println("__________________________");
        heroesTeam2.forEach(n -> System.out.println(n.toString()));
    }

    static ArrayList<Hero> heroesTeam1 = new ArrayList<>();
    static ArrayList<Hero> heroesTeam2 = new ArrayList<>();
    static ArrayList<Hero> generateCommand(int n) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1, 5)+n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName()));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName()));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName()));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName()));
                    break;
                case 5:
                    commandHeroes.add(new rogue(getName()));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName()));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName()));
                    break;



            }
        }


        return commandHeroes;
    }

    static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length-1)].name();
    }
}