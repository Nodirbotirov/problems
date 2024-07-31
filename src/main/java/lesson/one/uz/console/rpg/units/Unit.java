package lesson.one.uz.console.rpg.units;

import lesson.one.uz.console.rpg.Game;

public class Unit {
    Game game;
    String name;
    int level;
    int hp;
    int hpMax;
    int attack;
    int defense;

    public boolean isAlive(){
        return hp > 0;
    }

    public Unit(Game game, String name, int hpMax, int attack, int defense) {
        this.game = game;
        this.level = 1;
        this.name = name;
        this.hpMax = hpMax;
        this.hp = this.hpMax;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Unit target) {
        int actualDamage = target.takeDamage(attack);
        System.out.printf("%s нанес персонажу %s %d ед. урона\n", name, target.name, actualDamage);
        target.info();
    }
    public void rest() {
        heal(2);
    }

    public void heal(int amount){
        if (hp + amount > hpMax){
            amount = hpMax - hp;
        }
        System.out.printf("%s восстановил %d ед. здоровья\n", name, amount);
        info();
    }

    public void info() {
        System.out.printf("Имя: %s(%d) ХП: %d/%d Атака: %d Защита: %d\n", name, level, hp, hpMax, attack, defense);
    }

    public void startTurn(){
        System.out.println();
        info();
    }

    public void skipTurn(){
        System.out.printf("%s пропустил свой ход\n", name);

    }

    public int takeDamage(int amount){
        amount -= defense;
        if(amount < 0){
            amount = 0;
        }
        hp -= amount;
        return amount;
    }


}
