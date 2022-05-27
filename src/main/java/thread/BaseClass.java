package thread;

public class BaseClass {
    public static void main(String[] args) throws InterruptedException {
        Thread oqim1 = new Thread(new BizningOqim(20), "1-oqim");
        Thread oqim2 = new Thread(new BizningOqim(10), "2-oqim");
        oqim1.start();
        oqim1.join();
        oqim2.start();
    }
}
