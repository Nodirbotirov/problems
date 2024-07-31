package lesson.one.uz.console.rpg;

import lesson.one.uz.console.rpg.units.Unit;

public class Player {
    private Game game;
    private Unit hero;

    public Unit getHero() {
        return hero;
    }

    public Player(Game game){
        this.game = game;
        this.hero = new Unit(game, "Леопольд", 10, 2, 2 );
    }

    public void makeTurn() {
        System.out.println("ход игрока");
        hero.startTurn();
        int heroAction = game.getInputSystem().select("1.Атакавоть 2.Отдохнуть 3. Пропустить ход", 1, 3);
        if (heroAction == 1) {
            hero.attack(game.getAiPlayer().getMonster());
        }else if (heroAction == 2) {
            hero.rest();
        }else if (heroAction == 3) {
            hero.skipTurn();
        }
    }
}
