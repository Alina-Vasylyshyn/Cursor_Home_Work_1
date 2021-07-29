public class ArraySum {
    public static void main(String[] args) {
        int [] array = {1,-4 , 3, 7 , 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
