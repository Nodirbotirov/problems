package thread;

public class Oqim{
    public static void main(String[] args) throws InterruptedException {
        String[] massive = {"Echki maysa yiydi",
        "Qozichoq o't yiydi",
        "It suyak g'ajiydi",
        "bolalar tayoq yiydi"};

        for (int i = 0; i < massive.length; i++) {
            Thread.sleep(1000);

            System.out.println(massive[i]);
            System.out.println(System.currentTimeMillis());
        }
    }
}

//public class Oqim implements Runnable{
//
//    public static void main(String[] args) {
//        (new Thread(new Oqim())).start();
//        Oqim runnableObject = new Oqim();
//        Thread oqim = new Thread(runnableObject);
//        oqim.start();
//    }
//
//    @Override
//    public void run() {
//        System.out.println("men oqimman");
//    }
//}
