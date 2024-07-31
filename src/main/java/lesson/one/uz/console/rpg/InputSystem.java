package lesson.one.uz.console.rpg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSystem {
    private Scanner scanner;

    public InputSystem() {
        this.scanner = new Scanner(System.in);
    }

    public int select(String message, int min, int max) {
        int val = -1;
        do {
            try {
                System.out.println(message);
                val = scanner.nextInt();
            }catch (InputMismatchException e) {
                val = -1;
            }

        }while (val < min || val > max);
        return val;
    }



}
