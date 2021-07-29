import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        Integer[] array = {2,3,1,7,11};
        Arrays.sort(array, Collections.reverseOrder());
        for(int i:array) {
            System.out.println(i);
        }

    }
}
