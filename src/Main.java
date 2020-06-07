import java.io.File;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        String url = "http://www.sso.sy/sites/default/files/competitive%20programming%203_1.pdf";

        File out =new File("D:\\Intellij Projektai\\DownloadURL\\cp book");

        new Thread(new Download(url, out)).start();
    }
}
