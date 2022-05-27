package thread;

public class BizningOqim implements Runnable{
    private int uxlashDavomiyligi;

    public BizningOqim(int uxlashDavomiyligi){
        this.uxlashDavomiyligi = uxlashDavomiyligi;
    }
    @Override
    public void run() {
        String oqimNomi = Thread.currentThread().getName();

        for (int sanoq =1; sanoq<=10; sanoq++){
            System.out.format("%sdan %d-habar%n", oqimNomi, sanoq);
        }
        try {
            Thread.sleep(uxlashDavomiyligi);
        }catch (InterruptedException e){
            System.out.println("Bizga halaqit berishdi");
            System.exit(1);
        }
    }
}
