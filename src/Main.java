import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws Exception {
        String folderPath = "/home/vasiliy/lib";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));


    }

    public static long getFolderSize(File folder) throws Exception {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }
}
