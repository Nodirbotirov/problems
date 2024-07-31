package thread;

public class BizningOqim implements Runnable{
    private final int uxlashDavomiyligi;

    public BizningOqim(int uxlashDavomiyligi){
        this.uxlashDavomiyligi = uxlashDavomiyligi;
    }
    @Override
    public void run() {
        String threadFirst = Thread.currentThread().getName();

        for (int count =1; count<=10; count++){
            System.out.format("%sdan %d-habar%n", threadFirst, count);
        }
        try {
            Thread.sleep(uxlashDavomiyligi);
        }catch (InterruptedException e){
            System.out.println("Bizga halaqit berishdi");
            System.exit(1);
        }
    }
}
