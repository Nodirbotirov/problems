package file;

import java.io.File;

public class FileMkDir {
    public static void main(String[] args) {
        File fayl = new File(
                 File.separator+"home"+File.separator+"nodir"+File.separator+"snap"+File.separator+"yangiii"+File.separator);
        System.out.println(fayl.delete());
    }
}
