package code.schedulet;



import code.timerAndSocketIO.TimerExample;
import collection.flowbosConverter.client.ModbusClient;

import java.util.concurrent.*;
import java.util.*;
import java.io.*;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws IOException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(11);

        System.out.println(
                "Current time : " + Calendar.getInstance().get(Calendar.SECOND));

        for (int i = 10; i >= 0; i--) {
            scheduler.schedule(new Task(i), 10 - i,
                    TimeUnit.SECONDS);
        }


        scheduler.shutdown();

    }
}
