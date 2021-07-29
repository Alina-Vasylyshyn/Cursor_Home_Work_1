import java.util.Arrays;

public class ArrayDuplicated {
    public static void main(String[] args) {
        int [] array = {3,2,3,1,4,2,8,3};
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i ; j++) {
                if(array[i] == array[j]){
                    array[i] = 0;
                    break;
                }
            }
        }
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);

    }
}
