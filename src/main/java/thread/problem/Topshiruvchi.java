package thread.problem;

public class Topshiruvchi extends Thread{
    private Ombor ombor;

    public Topshiruvchi(Ombor ombor){
        this.ombor = ombor;
    }

    public void run(){
        String mahsulot = "";

        for (int count = 0; count < 10; count++){
            mahsulot = ombor.mahsulotniTopshirish();

            System.out.println("Buyurtmachi "  +
                    mahsulot + "ni oldii.");
            try {
                sleep(125);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
