package thread.problem;

public class Topshiruvchi extends Thread{
    private Ombor ombor;

    public Topshiruvchi(Ombor ombor){
        this.ombor = ombor;
    }

    public void run(){
        String malumot = "";

        for (int count = 0; count < 10; count++){
            malumot = ombor.magsulotniTopshirish();

            System.out.println("Buyurtmachi "  +
                    malumot + "ni oldii.");
            try {
                sleep(125);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
