package thread;

public class OqimRun implements Runnable{
    @Override
    public void run() {
        String[] massive = {
                "Echki maysa yiydi",
                "Qozichoq o't yiydi",
                "It suyak g'ajiydi",
                "bolalar tayoq yiydi"
        };
        for (String habar: massive){
            System.out.println(habar);
            try {
                Thread.sleep(4000);
            }catch (InterruptedException e) {
                System.out.println("bizga halaqit berishdi");
                return;
            }
        }
    }

    public static void main(String[] args) {
        OqimRun runnableObject = new OqimRun();
        Thread oqim = new Thread(runnableObject);

        oqim.start();
        try {
            Thread.sleep(7000);
            oqim.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
