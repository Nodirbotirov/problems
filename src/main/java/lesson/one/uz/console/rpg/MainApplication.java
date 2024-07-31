package lesson.one.uz.console.rpg;

public interface MainApplication {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.start();
    }
}
