package thread.problem;

public class IshlabChiqarish {
    public static void main(String[] args) {
        Ombor ombor = new Ombor();
        Korxona korxona = new Korxona(ombor);
        Topshiruvchi topshiruvchi = new Topshiruvchi(ombor);

        System.out.println("ishlab chiqarish boshlandi...");

        korxona.start();
        topshiruvchi.start();
    }
}
