package lesson.one.uz.console.rpg.items;

public class Weapon {
    private String title;
    private String title1;
    private int minAttack;
    private int maxAttack;


    public Weapon(String title, int minAttack, int maxAttack) {
        this.title = title;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
    }

    public int getDamage(){
        return minAttack + (int) (Math.random() * (maxAttack - minAttack));
    }


}
