package lesson.one.uz.console.rpg.units;

import lesson.one.uz.console.rpg.Game;

public class Hero extends Unit{

    private int exp = 0;
    private int[] expTo = {0, 1000, 2000, 4000, 8000, 1200, 15000, 1000000};

    public Hero(Game game, String name, int hpMax, int attack, int defense) {
        super(game, name, hpMax, attack, defense);
    }

    public void addExp(int amount) {
        exp += amount;
        if (exp >= expTo[level]){
            levelUp();
            exp -= expTo[level];
        }
    }

    private void levelUp() {
        level++;
        System.out.printf("%s повысил уровень до %d\n", name, level);
        hpMax += (level * 2 - 1);
        hp = hpMax;
    }
}
