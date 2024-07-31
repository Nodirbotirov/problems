package lesson.one.uz.console.rpg;



public class Game {

    private Player player;
    private AiPlayer aiPlayer;

    private InputSystem inputSystem;

    public Player getPlayer(){
        return player;
    }

    public AiPlayer getAiPlayer() {
        return aiPlayer;
    }

    public InputSystem getInputSystem(){
        return inputSystem;
    }

    public void init() {
        inputSystem = new InputSystem();
        player = new Player(this);
        aiPlayer = new AiPlayer(this);
    }

    public void start() {
        System.out.println("Игра началась");
        while(true) {
           player.makeTurn();
            if (isGameEnd()){
                break;
            }




            if (isGameEnd()){
                break;
            }
        }
    }

    public boolean isGameEnd(){
        if (!aiPlayer.getMonster().isAlive() && !player.getHero().isAlive()) {
            System.out.println("Все проиграли! Игра завершена");
            return true;
        }

        if (!aiPlayer.getMonster().isAlive()){
            System.out.println("Герой победил! Игра завершена");
            return true;
        }
        if (!player.getHero().isAlive()){
            System.out.println("Монстры победили! Игра завершена");
            return true;
        }
        return false;
    }
}
