package code.schedulet;

import java.util.Calendar;

public class Task implements Runnable {
    private int num;
    public Task(int num) { this.num = num; }

    @Override
    public void run() {
        System.out.println("Number " + num + " Current time : " + Calendar.getInstance().get(Calendar.SECOND));
    }
}
