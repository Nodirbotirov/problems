package lesson.one.uz.console.rpg;

import lesson.one.uz.console.rpg.units.Unit;

public class AiPlayer {
    private Game game;
    private Unit monster;

    public Unit getMonster() {
        return monster;
    }

    public AiPlayer(Game game){
        this.game = game;
        this.monster = new Unit(game, "Гоблин", 6, 4, 0 );
    }

    public void makeTurn() {
        System.out.println("ход оппонента");
        System.out.println("Ход врага");
        monster.startTurn();
        int monsterAction = (int) (Math.random() * 3) +1;
        if (monsterAction == 1) {
            monster.attack(game.getPlayer().getHero());
        }else if (monsterAction == 2) {
            monster.rest();
        }else if (monsterAction == 3) {
            monster.skipTurn();
        }
    }
}
