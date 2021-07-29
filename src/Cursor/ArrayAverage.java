public class ArrayAverage {
    public static void main(String[] args) {
        int [] array = {1,2,4,1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        System.out.println(avg);
    }
}
