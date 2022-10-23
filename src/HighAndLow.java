import java.util.Arrays;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();
        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return max + " " + min;
    }
}
