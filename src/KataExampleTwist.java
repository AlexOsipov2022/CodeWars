import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class KataExampleTwist {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eee()));
    }

    public static String[] eee() {

        String[] websites = new String[1000];
        for (int i = 0; i < 1000; i++) {
            websites[i] = "codewars";
        }
        return websites;
    }
}
//https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/java
