import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void maxMinWriter(String num) {
        try (FileWriter out = new FileWriter("Result.txt", true)) {
            out.write(num +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
