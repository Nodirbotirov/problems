package thread.problem;
public class Ombor {
    private String tayyorMahsulot;
    private boolean tayyormi = false;

    public synchronized void mahsulotniJoylash(String mahsulot){
        while (tayyormi){
            try {
                wait(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        tayyorMahsulot = mahsulot;
        tayyormi = true;
    }

    public synchronized String mahsulotniTopshirish(){
        while (!tayyormi){
            try {
                wait(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        tayyormi = false;
        notifyAll();
        return tayyorMahsulot;
    }
}
