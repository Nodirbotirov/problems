package thread.problem;

public class Korxona extends Thread{

    private Ombor ombor;

    public Korxona(Ombor ombor){
        this.ombor = ombor;
    }

    public void run(){
        for (int count = 1; count<= 10; count++){
            ombor.mahsulotniJoylash(count+ "-mahsulot");

            System.out.println("Korxona "+
                    count + "-mahsulotni omborga joyladi.");

            try {
                sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
